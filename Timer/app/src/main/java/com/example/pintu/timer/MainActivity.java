package com.example.pintu.timer;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    private Chronometer chronometer;
    private long pauseoffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        chronometer =findViewById(R.id.chronometer);
        chronometer.setFormat("Time : %s");
        chronometer.setBase(SystemClock.elapsedRealtime());


        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if ((SystemClock.elapsedRealtime() -chronometer.getBase()) >=10000){

                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(MainActivity.this,"Bing!",Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
    public void StartChronometer(View v){
        if (!running){

            chronometer.setBase(SystemClock.elapsedRealtime() - pauseoffset);

            chronometer.start();
            running =true;

            Toast.makeText(this,"Chronometer is started!",Toast.LENGTH_SHORT).show();
        }



    }
    public void PauseChronometer(View v){
        if (running){


            chronometer.stop();
            pauseoffset = SystemClock.elapsedRealtime() -chronometer.getBase();
            running =false;

            Toast.makeText(this,"Chronometer is Paused!",Toast.LENGTH_SHORT).show();


        }

    }

    public void ResetChronometer(View v){

        chronometer.setBase(SystemClock.elapsedRealtime());

        pauseoffset =0;

        Toast.makeText(this,"Chronometer is Reseted!",Toast.LENGTH_SHORT).show();


    }
    public void SetChronometer(View v){

        chronometer.setFormat("Time :(%s)");

        Toast.makeText(this,"Please set the timer ..",Toast.LENGTH_SHORT).show();


    }
    public void ClearChronometer(View v){

        chronometer.setFormat(null);

        Toast.makeText(this,"Time is Cleared please set the format again...!",Toast.LENGTH_SHORT).show();


    }

}
