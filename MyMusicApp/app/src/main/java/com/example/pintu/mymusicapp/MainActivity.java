package com.example.pintu.mymusicapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{
    Button play,pause,stop;
    MediaPlayer mediaPlayer;

    private int SeekForwardTime = 5 *1000;
    private  int SeekRewindTime = 5 * 1000;   //5 sec back



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = (Button) findViewById(R.id.play);
        pause = (Button) findViewById(R.id.pause);
        stop =(Button)findViewById(R.id.stop);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.play:
                mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.clap);
                mediaPlayer =MediaPlayer.create(getApplicationContext(),R.raw.guitar);

                mediaPlayer.start();

                Toast.makeText(getApplicationContext(),"Song is Played",Toast.LENGTH_SHORT).show();
                break;

            case R.id.pause:
                mediaPlayer.pause();
                Toast.makeText(getApplicationContext(),"Song is Paused",Toast.LENGTH_SHORT).show();
                break;

            case R.id.stop:
                mediaPlayer.stop();
                Toast.makeText(getApplicationContext(),"Song is Stopped",Toast.LENGTH_SHORT).show();
                break;

            
        }
    }
}
