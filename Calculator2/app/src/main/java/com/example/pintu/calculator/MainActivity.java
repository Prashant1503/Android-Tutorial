package com.example.pintu.calculator;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private double value1 =Double.NaN;
    private double value2;
    EditText result;
    private char ACTION;

    String tv;

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,
            btnLeftArrow, btnPlus_Minus, btnDivide, btnMultiply, btnSubstract, btnAdd, btnDecimal, btnEqual, btnAc;


    private final  char Addition= '+';
    private final  char Substraction= '-';
    private final  char Division= '/';
    private final  char Multiplication= '*';
    private final  char Equal ='=';



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);

        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);

        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);

        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnAdd = findViewById(R.id.btnAdd);
        btnSubstract = findViewById(R.id.btnSubstract);

        btnMultiply = findViewById(R.id.btnMultiply);
        btnDivide = findViewById(R.id.btnDivide);

        btnDecimal = findViewById(R.id.btnDecimal);
        btnEqual = findViewById(R.id.btnEqual);
        btnAc = findViewById(R.id.btnAc);
        result = findViewById(R.id.edit_text_result);




        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText(String.format("%s 0", result.getText().toString()));
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 1", result.getText().toString()));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 2", result.getText().toString()));
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 3", result.getText().toString()));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 4", result.getText().toString()));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 5", result.getText().toString()));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 6", result.getText().toString()));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 7", result.getText().toString()));
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 8", result.getText().toString()));
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(String.format("%s 9", result.getText().toString()));
            }
        });


    }

 }
