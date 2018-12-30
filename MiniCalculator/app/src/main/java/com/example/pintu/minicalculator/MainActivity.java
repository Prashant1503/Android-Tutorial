package com.example.pintu.minicalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.security.spec.ECField;

public class MainActivity extends AppCompatActivity {
    Button btnAdd,btnDiv,btnMul,btnSub,btnPer;
    EditText firstNumber, SecondNumber;
    TextView Result;

    int num1, num2, sum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Button are casted by the Xml File ...
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnDiv =(Button)findViewById(R.id.btnDiv);
        btnMul =(Button)findViewById(R.id.btnMul);
        btnSub =(Button)findViewById(R.id.btnSub);
        btnPer =(Button)findViewById(R.id.btnPer);


        //Text view and Edit Text are casted by Xml File. .....
        firstNumber = (EditText) findViewById(R.id.txtNumber1);
        SecondNumber = (EditText) findViewById(R.id.txtNumber2);
        Result = (TextView) findViewById(R.id.result);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(firstNumber.getText().toString());
                num2 =Integer.parseInt(SecondNumber.getText().toString());

                sum =num1 + num2;
                Result.setText(Integer.toString(sum));
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(firstNumber.getText().toString());
                num2 =Integer.parseInt(SecondNumber.getText().toString());

                sum =num1 - num2;
                Result.setText(Integer.toString(sum));


            }
        });


        btnPer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(firstNumber.getText().toString());
                num2 =Integer.parseInt(SecondNumber.getText().toString());

                try{
                    sum =num1 / num2 * 100;
                    Result.setText(Float.toString(sum));
                }
                catch (Exception e){
                    Result.setText("Error");
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(firstNumber.getText().toString());
                num2 =Integer.parseInt(SecondNumber.getText().toString());

                sum = num1 * num2;
                Result.setText(Integer.toString(sum));


            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num1 =Integer.parseInt(firstNumber.getText().toString());
                num2 =Integer.parseInt(SecondNumber.getText().toString());

                try{
                    sum =num1 / num2;
                    Result.setText(Float.toString(sum));
                }
                catch (Exception e){
                    Result.setText("Error");
                }
            }
        });







    }



}
