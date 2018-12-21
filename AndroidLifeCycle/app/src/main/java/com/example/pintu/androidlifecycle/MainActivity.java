package com.example.pintu.androidlifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "In onCreate Method()", Toast.LENGTH_LONG).show();
    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "In onPause Method", Toast.LENGTH_LONG).show();

    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "In onStart Method", Toast.LENGTH_LONG).show();
    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "In onReStart Method", Toast.LENGTH_LONG).show();
    }

    protected void onResume()

    {
        super.onResume();
        Toast.makeText(getApplicationContext(), "In onResume Method", Toast.LENGTH_LONG).show();
    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "In onStop Method", Toast.LENGTH_LONG).show();
    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "In onDestroy Method", Toast.LENGTH_LONG).show();
    }


}
