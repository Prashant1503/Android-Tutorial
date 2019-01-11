package com.example.pintu.smsmanager;

import android.Manifest;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {
    EditText inputMessage,inputNumber;
    Button btnSend;

    int MY_PERMISSION_REQUEST_SEND_SMS =1;

    String SENT = "SMS_SENT";
    String DELIEVERED = "SMS_DELIEVERED";

    PendingIntent sentPI,delieveredPI;
    BroadcastReceiver smsSentReceiver,smsDelieveredReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputMessage=(EditText)findViewById(R.id.inputMessage);
        inputNumber =(EditText)findViewById(R.id.inputNumber);

        btnSend=(Button)findViewById(R.id.btnSend);

        sentPI = PendingIntent.getBroadcast(this,0,new Intent(SENT),0);
        delieveredPI =PendingIntent.getBroadcast(this,0,new Intent(DELIEVERED),0);
    }

    @Override
    protected void onResume() {
        super.onResume();

        smsSentReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                switch (getResultCode())
                {
                    case SmsManager.RESULT_ERROR_GENERIC_FAILURE:
                        Toast.makeText(MainActivity.this,"Generic Failure",LENGTH_LONG).show();
                        break;

                    case Activity
                                .RESULT_OK:
                        Toast.makeText(MainActivity.this,"Sms Sent!",Toast.LENGTH_LONG).show();
                    break;

                    case SmsManager.RESULT_ERROR_NO_SERVICE:
                        Toast.makeText(MainActivity.this,"No service",Toast.LENGTH_LONG).show();
                        break;

                    case SmsManager.RESULT_ERROR_NULL_PDU:
                        Toast.makeText(MainActivity.this,"Null PDU",Toast.LENGTH_LONG).show();
                        break;

                    case SmsManager.RESULT_ERROR_RADIO_OFF:
                        Toast.makeText(MainActivity.this,"Radio off!",Toast.LENGTH_LONG).show();
                        break;


                }

            }
        };
        smsDelieveredReceiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {

                switch (getResultCode()){
                    case Activity.RESULT_OK:
                        Toast.makeText(MainActivity.this,"SMS Delievered",Toast.LENGTH_LONG).show();
                        break;

                    case Activity.RESULT_CANCELED:
                        Toast.makeText(MainActivity.this,"Sms not Delievered!",Toast.LENGTH_LONG).show();
                        break;


                }

            }
        };

        registerReceiver(smsSentReceiver,new IntentFilter(SENT));
        registerReceiver(smsDelieveredReceiver,new IntentFilter(DELIEVERED));


    }

    @Override
    protected void onPause() {
        super.onPause();

        unregisterReceiver(smsDelieveredReceiver);
        unregisterReceiver(smsSentReceiver);
    }

    public void send(View view) {

        String message = inputMessage.getText().toString();
        String telNr = inputNumber.getText().toString();

        if (ContextCompat.checkSelfPermission(this,Manifest.permission.SEND_SMS) !=PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.SEND_SMS},MY_PERMISSION_REQUEST_SEND_SMS);




        }
        else {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(telNr,null,message,sentPI,delieveredPI);




        }




    }


    }

