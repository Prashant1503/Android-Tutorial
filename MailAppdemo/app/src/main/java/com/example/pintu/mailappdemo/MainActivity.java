package com.example.pintu.mailappdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText mEditTextTo;
    private EditText mEditTextSubject;
    private EditText mEditTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditTextTo =(EditText)findViewById(R.id.edit_text_to);
        mEditTextSubject =(EditText)findViewById(R.id.edit_text_subject);
        mEditTextMessage =(EditText)findViewById(R.id.edit_text_message);

        Button btnSend = findViewById(R.id.btnSend);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });
    }
    private void sendMail(){
        String receipientList = mEditTextTo.getText().toString();
        String [] receipients = receipientList.split(" ,");

        String subject = mEditTextSubject.getText().toString();
        String message = mEditTextMessage.getText().toString();


        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL,receipients);
        intent.putExtra(Intent.EXTRA_SUBJECT,subject);
        intent.putExtra(Intent.EXTRA_TEXT,message);
        intent.setData(Uri.parse("mailito:"));


        intent.setType("text/plain");
        startActivity(Intent.createChooser(intent,"choose an Email Client"));
    }
}
