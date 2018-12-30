package com.example.pintu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnAdd,
            btnSub, btnDivide, btnMul, btnAc, btnBackArrow,btnEqual;

    EditText edt;
    int number1,number2;
    int value1, value2, sum = 0;

    String calculate;
    boolean add, sub, Mul, div, mix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        Buttons are casted with xml file ......

        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        Button btnMul = (Button) findViewById(R.id.btnMul);
        Button btnAc = (Button) findViewById(R.id.btnAc);
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        Button btnBackArrow = (Button) findViewById(R.id.btnBackArrow);
        Button btnEqual = (Button) findViewById(R.id.btnEqual);


//        Edit Text is casted with XML File ....
        final EditText edt = (EditText) findViewById(R.id.edt);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 calculate= edt.getText().toString();
                 edt.setText(calculate + "0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "6");
            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculate= edt.getText().toString();
                edt.setText(calculate + "9");
            }
        });

                   //Performing calculation ....................

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               switch (v.getId()){
                   case  R.id.btnAdd:

                       number2 =Integer.parseInt(edt.getText().toString());


                       edt.setText(number1 + number2);


               }



            }
        });











    }


}
