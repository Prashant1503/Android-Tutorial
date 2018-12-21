package com.example.pintu.alarmmanagerdemo;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

import java.sql.BatchUpdateException;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TimePicker timePicker;
    Button btnSetAlarm,btnStopAlarm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnSetAlarm = (Button)findViewById(R.id.btnSetAlarm);

        timePicker  = (TimePicker)findViewById(R.id.timePicker);







        btnSetAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Calendar calendar = Calendar.getInstance();

                if (Build.VERSION.SDK_INT >= 23) {
                    calendar.set(
                            calendar.get(calendar.YEAR),
                            calendar.get(calendar.MONTH),
                            calendar.get(calendar.DAY_OF_MONTH),
                            timePicker.getHour(),
                            timePicker.getMinute(),
                            0

                    );
                } else {
                    calendar.set(
                            calendar.get(calendar.YEAR),
                            calendar.get(calendar.MONTH),
                            calendar.get(calendar.DAY_OF_MONTH),
                            timePicker.getCurrentHour(),
                            timePicker.getCurrentMinute(),
                            0
                    );

                }
                SetAlarm(calendar.getTimeInMillis());



            }

        });
        Button btnStopAlarm = (Button)findViewById(R.id.btnStopAlarm);
        btnStopAlarm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopAlarmManager();
            }
        });

    }



    private void SetAlarm(long timeInMillis) {
        AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(this,MyAlarm.class);
        PendingIntent broadcast =PendingIntent.getBroadcast(this,0,intent,0);

        alarmManager.setRepeating(AlarmManager.RTC,
                timeInMillis,AlarmManager.INTERVAL_DAY,broadcast);

        Toast.makeText(this,"Alarm is set",Toast.LENGTH_SHORT).show();
    }
    public  void stopAlarmManager(){
        AlarmManager manager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        PendingIntent pIntent = PendingIntent.getBroadcast(getApplicationContext(),100,getIntent(),PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager)getApplicationContext().getSystemService(Context.ALARM_SERVICE);
        alarmManager.cancel(pIntent);




    }

    }




    ;

