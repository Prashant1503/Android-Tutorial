package com.example.pintu.smsappdemo;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity2 extends Activity {
    EditText message,phone_no;

    private final static int SEND_SMS_PERMISSION_CODE = 111;
    private Button sendMesage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        sendMesage =(Button)findViewById(R.id.send_message);
        final  EditText message = (EditText)  findViewById(R.id.message);
        final EditText phone = (EditText)findViewById(R.id.phone_no);

        sendMesage.setEnabled(false);

        if(checkPermission(Manifest.permission.SEND_SMS)){
            sendMesage.setEnabled(true);
            
        }
        else
        {
            ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.SEND_SMS},SEND_SMS_PERMISSION_CODE);

            sendMesage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String msg = message.getText().toString();
                    String phoneNumber =phone.getText().toString();

                    if(!TextUtils.isEmpty(msg) && !TextUtils.isEmpty(phoneNumber)){

                        if(checkPermission(Manifest.permission.SEND_SMS)){
                            SmsManager smsManager = SmsManager.getDefault();
                            smsManager.sendTextMessage(phoneNumber,null,msg,null,null);

                        }
                        else {
                            Toast.makeText(MainActivity2.this,"Permission Granted",Toast.LENGTH_SHORT).show();
                        }

                    }
                    else
                    {
                        Toast.makeText(MainActivity2.this,"Enter a message and a Phone Number",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }

    }

    private boolean checkPermission(String permision) {

        int checkPermission = ContextCompat.checkSelfPermission(this,permision);
        return checkPermission ==PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {

        switch (requestCode){
            case SEND_SMS_PERMISSION_CODE:

                if (grantResults.length > 0 && (grantResults[0] == PackageManager.PERMISSION_GRANTED)){
                    sendMesage.setEnabled(true);
                }

                break;


        }

    }
}
