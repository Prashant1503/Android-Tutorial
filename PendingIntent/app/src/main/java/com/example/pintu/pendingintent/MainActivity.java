package com.example.pintu.pendingintent;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doSomething(View view) {
        Intent intent = new Intent(MainActivity.this,NotificationActivity.class);

        PendingIntent pi = PendingIntent.getActivity(MainActivity.this,0,intent,0);

        Notification notification = new NotificationCompat.Builder(this)
                .setSmallIcon(android.R.drawable.stat_notify_missed_call)
                .setContentTitle("Notification")
                .setContentText("Click me to open the Next Activity")
                .setAutoCancel(true).setContentIntent(pi).build();

        NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        manager.notify(2,notification);
    }
}
