package com.example.pintu.sqliteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 =(findViewById(R.id.btnAddUser));
        b2 =(findViewById(R.id.btnUpdateUser));
        b3 =(findViewById(R.id.btnViewUser));
        b4 =(findViewById(R.id.btnDelete));


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this,InsertUser.class));
                finish();


            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });


        MyDbHandler myDbHandler = new MyDbHandler(getApplicationContext(),"Userdb",null,1);

        Temp.setMyDbHandler(myDbHandler);

    }
}
