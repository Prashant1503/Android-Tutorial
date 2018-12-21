package com.example.pintu.servicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startService(View view) {
        Intent intent = new Intent(this,MyService.class);
        startService(intent);

    }

    public void stopService(View view){
        Intent intent = new Intent(this,MyService.class);
        stopService(intent); ///Calling the Stop service and Start Service.....
    }



}
