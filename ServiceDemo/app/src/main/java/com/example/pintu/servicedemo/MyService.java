package com.example.pintu.servicedemo;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {



    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet Implemented");
    }

    @Override
    public void onCreate() {
        Toast.makeText(this,"Service was created",Toast.LENGTH_LONG).show();
        super.onCreate();
    }
    public int onStartCommand(Intent intent, int startId){

        Toast.makeText(this,"Service started",Toast.LENGTH_SHORT).show();
        return START_STICKY;

    }
    public void onDestroy(){
        Toast.makeText(this,"Service Destroyed",Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}
