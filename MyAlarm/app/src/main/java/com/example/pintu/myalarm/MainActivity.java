package com.example.pintu.myalarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DigitalClock;
import android.widget.TimePicker;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    TimePicker alarmTime;
    DigitalClock currentTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alarmTime = findViewById(R.id.timePicker);
        currentTime = findViewById(R.id.DigitalClock);

        Timer t = new Timer();
        t.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                if (currentTime.getText().toString().equals(alarmTime())) {


                }
            }

            public String alarmTime() {
                Integer alarmHours = null;
                Integer alarmMinutes = null;

                String stringAlarmTime;

                if (alarmHours > 12) {

                    alarmHours = alarmHours - 12;
                    stringAlarmTime = alarmHours.toString().concat(":").concat(alarmMinutes).toString().concat(" PM");
                } else {
                    stringAlarmTime = alarmHours.toString().concat(":").concat(alarmMinutes).toString().concat(" AM");

                }
                return stringAlarmTime;
            }


        });
    }
}
