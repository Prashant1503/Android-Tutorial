package com.example.pintu.toasttutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 =(Button)findViewById(R.id.button1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showToast();
            }
        });

    }
      public void showToast(){
          LayoutInflater inflater = getLayoutInflater();
          View layout = inflater.inflate(R.layout.toast_layout,(ViewGroup)findViewById(R.id.toast_root));

          TextView textView = layout.findViewById(R.id.toast_text);
          ImageView toastImage = layout.findViewById(R.id.toast_image);

          textView.setText("This is a diffrent way");
          toastImage.setImageResource(R.drawable.ic_toasticon);

          Toast toast = new Toast(getApplicationContext());
          toast.setGravity(Gravity.CENTER,0,0);
          toast.setDuration(Toast.LENGTH_SHORT);
          toast.setView(layout);
          toast.show();


    }
}