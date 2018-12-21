package com.example.pintu.serviceexampleaudiodemo;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.widget.TextView;
import android.widget.Toast;

public class MyService extends Service {
    MediaPlayer mediaPlayer;
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service Created",Toast.LENGTH_LONG).show();

        mediaPlayer = MediaPlayer.create(this,R.)
    }
}
