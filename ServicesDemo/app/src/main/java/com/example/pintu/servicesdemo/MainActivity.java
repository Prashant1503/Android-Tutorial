package com.example.pintu.servicesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonStart,buttonStop;
    TextView tvThreadCount;
    int count=0;
    private MyAsyncTask myAsyncTask;
    private Intent serviceIntent;
    private boolean mStopLoop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i(getString(R.string.))
    }
}
