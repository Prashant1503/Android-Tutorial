package com.example.pintu.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.sql.BatchUpdateException;

import static java.lang.Float.parseFloat;

public class MainActivity extends AppCompatActivity {
    Button btnZero,btnOne,btnTwo,btnThree,btnFour,btnFIve,btnSix,btnSeven,btnEight,btnNine,
    btnAddition,btnSubstraction,btnMultiplication,btnDivision,btnClear,btnEqual,btnDecimal;

    EditText editText;
    boolean Addition,Multiplication,Substraction,Division;

    int value1,value2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnZero =(Button)findViewById(R.id.btnZero);
        btnOne =(Button)findViewById(R.id.btnOne);
        btnTwo =(Button)findViewById(R.id.btnTwo);
        btnThree=(Button)findViewById(R.id.btnThree);
        btnFour=(Button)findViewById(R.id.btnFour);
        btnFIve=(Button)findViewById(R.id.btnFive);
        btnSix =(Button)findViewById(R.id.btnSix);
        btnSeven =(Button)findViewById(R.id.btnSeven);
        btnEight =(Button)findViewById(R.id.btnEight);
        btnNine =(Button)findViewById(R.id.btnNine);
        btnAddition =(Button)findViewById(R.id.btnAddition);
        btnSubstraction =(Button)findViewById(R.id.btnSubstraction);
        btnMultiplication =(Button)findViewById(R.id.btnMultiplication);
        btnDivision =(Button)findViewById(R.id.btnDivision);
        btnClear =(Button)findViewById(R.id.btnClear);
        btnEqual =(Button)findViewById(R.id.btnEqual);
        btnDecimal =(Button)findViewById(R.id.btnDecimal);

        editText =(EditText)findViewById(R.id.editText);

        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "0");
            }
        });
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "1");
            }
        });
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "2");
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + " 3");
            }
        });
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + " 4");
            }
        });
        btnFIve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "5");
            }
        });
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + " 6");
            }
        });
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + " 7");
            }
        });
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + "8");
            }
        });
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText(editText.getText() + " 9");
            }
        });
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(editText == null){
                    editText.setText(" ");
                }
                else {
                    value1 =Integer.parseInt(editText.getText() + " ");
                    value2 =Integer.parseInt(editText.getText() + " ");
                    Addition =true;
                    editText.setText(null);
                }

            }
        });
        btnSubstraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 =Integer.parseInt(editText.getText() + " ");
                value2 = Integer.parseInt(editText.getText() + " ");
                editText.setText(null);

            }
        });
        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 =Integer.parseInt(editText.getText() + " ");
                value2 = Integer.parseInt(editText.getText() + " ");
                editText.setText(null);
            }
        });
        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value1 =Integer.parseInt(editText.getText() + " ");
                value2 =Integer.parseInt(editText.getText() + " ");
                editText.setText(null);
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Addition ==true){
                    editText.setText(value1 + value2 + " ");
                    Addition =false;
                }
            }
        });



    }
}
