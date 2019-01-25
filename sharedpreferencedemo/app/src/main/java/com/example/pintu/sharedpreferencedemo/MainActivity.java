package com.example.pintu.sharedpreferencedemo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name, password;
    Button store, load;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (findViewById(R.id.etUsername));
        password = (findViewById(R.id.etPassword));
        store = (findViewById(R.id.btnStore));
        load = (findViewById(R.id.btnLoad));

        store.setOnClickListener(this);
        load.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btnStore) {

///Storing the data using sharedpreference class ...

            SharedPreferences sharedPreferences = getSharedPreferences("Data", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit(); //SharedPreferences.Editor is a subclass of sharedPreference...

            editor.putString("name", name.getText().toString()); //"name" is  a key and password is value..
            editor.putString("password", password.getText().toString());

            editor.apply();  //To commit or apply the changes to shared preferences...

            Toast.makeText(this, "Data saved succesfully", Toast.LENGTH_SHORT).show();

            name.setText(" ");
            password.setText(" ");
        } else if (v.getId() == R.id.btnLoad) {
//Load the data ...
            SharedPreferences sharedPreferences = getSharedPreferences("Data",Context.MODE_PRIVATE);

            String struser = sharedPreferences.getString("name", "");
            String strpassword = sharedPreferences.getString("password", "");

            assert struser != null;
            if (Objects.equals(struser, "") || Objects.equals(strpassword, " ")) {

                Toast.makeText(this,"Data not found",Toast.LENGTH_SHORT).show();

            }
            else {
                name.setText(struser);
                password.setText(strpassword);///Setting the text to Edit text..

                Toast.makeText(this,"Loaded data successfully",Toast.LENGTH_SHORT).show();

            }

        }
    }
}