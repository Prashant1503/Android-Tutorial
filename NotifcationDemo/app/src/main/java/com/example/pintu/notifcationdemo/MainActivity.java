package com.example.pintu.notifcationdemo;

import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.support.v4.app.NotificationCompat.PRIORITY_DEFAULT;

public class MainActivity extends AppCompatActivity {

    //1. Notification Channel
    //2. Notification Builder
    //3. Notification Manager

    private static final String CHANNEL_ID ="tutsgalaxy";
    private static final String CHANNEL_NAME = "Prashant1503";
    private static final String CHANNEL_DESCRIPTION = "Prashant1503 Notifications";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Checking the Version above the android Oreo if it is Higher than Oreo than this line will get Executed.....

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID,CHANNEL_NAME,NotificationManager.IMPORTANCE_DEFAULT);
            channel.setDescription(CHANNEL_DESCRIPTION);
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel);
        }


        findViewById(R.id.btnNotify).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayNotfication();
            }
        });
    }
    //Method to create Notification in Notification bar

    private void displayNotfication(){

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this,CHANNEL_ID)
                .setSmallIcon(R.drawable.ic_info_outline_black_24dp)
                .setContentTitle("Notification is working!")
                .setContentText("First Notification")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);



        NotificationManagerCompat notificationManagerCompat =NotificationManagerCompat.from(this);
        notificationManagerCompat.notify(1,mBuilder.build());
    }

}

