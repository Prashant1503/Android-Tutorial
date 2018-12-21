package com.example.pintu.mediaplayerservice;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button start,stop;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button start =(Button)findViewById(R.id.btnStart);
         final Button stop =(Button) findViewById(R.id.btnStop);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.chamma);
                mediaPlayer.start();

                start.setEnabled(false);
                Toast.makeText(getApplicationContext(), "Song is started playing", Toast.LENGTH_LONG).show();

            }
            public void onCompletion(MediaPlayer mediaPlayer){
                mediaPlayer.release();
                mediaPlayer =null;
                Toast.makeText(getApplicationContext(),"Song is Finished",Toast.LENGTH_LONG).show();

                start.setEnabled(true);

            }
        });
        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer!=null){
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer =null;

                        Toast.makeText(getApplicationContext(),"Song is stopped",Toast.LENGTH_LONG).show();
                        start.setEnabled(true);
                }



            }
        });

    }
}
