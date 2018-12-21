package com.example.pintu.myservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate(){
        super.onCreate();
        Toast.makeText(this,"Service is created",Toast.LENGTH_SHORT).show();
    }
    public void onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"Service is destoryed",Toast.LENGTH_SHORT).show();
    }
    public int onStartCommand(Intent intent,int flags,int startId){
        return super.onStartCommand(intent,flags,startId);
    }
}
