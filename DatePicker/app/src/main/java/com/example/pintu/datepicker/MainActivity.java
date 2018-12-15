package com.example.pintu.datepicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    Button selectDate;
    TextView date;
    DatePickerDialog datePickerDialog;

    int year;
    int month;
    int dayOfMonth;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectDate =(Button)findViewById(R.id.btnDate);
        date =(TextView)findViewById(R.id.tvSelectedDate);

        selectDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                calendar =Calendar.getInstance();
                year = calendar.get(Calendar.YEAR);
                month =calendar.get(Calendar.MONTH);
                dayOfMonth =calendar.get(Calendar.DAY_OF_MONTH);


                datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        date.setText(dayOfMonth + "/" +(month +1) + "/" + (year+100));
                    }
                },0,0,0);
                datePickerDialog.show();


            }
        });
    }
}
