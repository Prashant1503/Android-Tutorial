package com.example.pintu.arrayadapterdemi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {
    //Array of String

    ListView simpleList;
    String animalList[] ={"Lion","Elephant","Monkey","Chetah","Owl","Dog","Camel"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayAdapter  arrayAdapter = new ArrayAdapter<String>(this,R.layout.listview,R.id.textView,animalList);

        ListView listView =(ListView)findViewById(R.id.simpleListView);
        listView.setAdapter(arrayAdapter);

    }
}
