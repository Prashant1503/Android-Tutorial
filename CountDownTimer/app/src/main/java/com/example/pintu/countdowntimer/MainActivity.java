package com.example.pintu.countdowntimer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private static final long START_TIME_IN_MILLIS = 60000;


    private TextView tvCountDown;
    private Button start;
    private Button reset;
    private Button pause;
    private CountDownTimer countDownTimer;  //Count DownTImer;

    private boolean timerRunning;
    private long timeLeftInMillis = START_TIME_IN_MILLIS;
    private Object CountDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvCountDown =(findViewById(R.id.tv_countDownTimer));
        start = (findViewById(R.id.btnStart));
        reset =(findViewById(R.id.btnRestart));
        pause =(findViewById(R.id.btnPause));

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimmer();



            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetTimer();

            }
        });
        updateCountDownText();

        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) throws RuntimeException {
               try{
                   if (timerRunning){
                       pauseTimmer();
                   }
                   else {
                       startTimmer();
                   }

               }catch (Exception e){
                   System.out.println("Exception is occurred during Pause button");
               }



            }
        });
    }
    private void startTimmer(){
        CountDownTimer = new CountDownTimer(timeLeftInMillis,1000){

            @Override
            public void onTick(long millisUntilFinished) {

                timeLeftInMillis = millisUntilFinished;

                updateCountDownText();

            }

            @Override
            public void onFinish() {

                timerRunning =false;
                pause.setText("start");


            }
        }.start();

        timerRunning =true;
        pause.setText("pause");


    }
    private void pauseTimmer(){

        countDownTimer.cancel();
        timerRunning =false;

        pause.setText("start");



    }
    private void resetTimer(){

        timeLeftInMillis = START_TIME_IN_MILLIS;
        updateCountDownText();

    }

    private void updateCountDownText(){

        int minutes = (int) (timeLeftInMillis /1000 /60);
        int seconds =(int) (timeLeftInMillis /1000 % 60);

        String timeLeftFormatted = String.format(Locale.getDefault(),"%02d:%02d",minutes,seconds);

        tvCountDown.setText(timeLeftFormatted);

    }
}
