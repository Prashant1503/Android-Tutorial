package com.example.pintu.sqliteapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InsertUser extends AppCompatActivity {

    EditText t1,t2,t3,t4,t5;
    MyDbHandler myDbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_user);

        t1 =(findViewById(R.id.editText1));
        t2 =(findViewById(R.id.editText2));
        t3 =(findViewById(R.id.editText3));
        t4 =(findViewById(R.id.editText4));
        t5 =(findViewById(R.id.editText5));

        myDbHandler= Temp.getMyDbHandler();

    }

    public void save(View view) {

        String id = t1.getText().toString();
        String name = t2.getText().toString();
        String department = t3.getText().toString();
        String emai = t4.getText().toString();
        String phone= t5.getText().toString();

        if (id.equals(" ") ||name.equals(" ") || department.equals(" ") || emai.equals(" ")
                || phone.equals(" ")){

            Toast.makeText(this,"PLZ fill All the details",Toast.LENGTH_SHORT).show();
        }
        else {

            User user  =new User();
            user.setId(id);
            user.setName(name);
            user.setDepartment(department);
            user.setEmail(emai);
            user.setMobile(phone);

           int i =  myDbHandler.insert(user);

           if (i ==1){
               Toast.makeText(this,"User data inserted",Toast.LENGTH_SHORT).show();
           }
           else {
               Toast.makeText(this,"User Data not Inserted",Toast.LENGTH_SHORT).show();
           }


        }



    }
}
