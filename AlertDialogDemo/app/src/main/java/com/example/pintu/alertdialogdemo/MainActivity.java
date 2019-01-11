package com.example.pintu.alertdialogdemo;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button positive,negative,neutral;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        positive =(Button)findViewById(R.id.btnPositive);
        negative =(Button)findViewById(R.id.btnNegative);
        neutral=(Button)findViewById(R.id.btnNeutral);


        // Positive button code .....

        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());


                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"Positive button clicked",Toast.LENGTH_SHORT).show();

                    }
                });
                builder.show();

            }
        });
// Negative button  code ....
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

                builder.setTitle("Sample alert");
                builder.setMessage("Negative button alert dialog");
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        Toast.makeText(getApplicationContext(),"Negative action button is clicked",Toast.LENGTH_SHORT).show();
                    }
                });
                builder.show();
            }
        });

        // Neutral button code ....
        neutral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

                builder.setTitle("Sample alert");
                builder.setMessage("Neutral button alert dialog");
                builder.setNeutralButton("CANCEl", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Neutral action button is clicked",Toast.LENGTH_SHORT).show();



                    }
                });
                builder.show();
            }
        });



    }

    }

