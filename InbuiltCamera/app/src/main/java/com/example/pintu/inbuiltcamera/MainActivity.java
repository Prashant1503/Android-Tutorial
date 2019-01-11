package com.example.pintu.inbuiltcamera;
import android.content.Intent;

import android.graphics.Bitmap;
import android.provider.MediaStore;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.provider.MediaStore.*;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ImageView imageView;

   public static final int camera_request = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        imageView = findViewById(R.id.ImageView);



    }

    public void openCamera(View view) {
        Intent intent = new Intent(ACTION_IMAGE_CAPTURE);  //Action Image capture is a constant used for capturing image....
        startActivityForResult(intent,camera_request);



    }
 // We had overide the onActivityResult method.

//    here the onActivityResult method is used to come back from the caputred position and then again it captures the image

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode ==camera_request){
           Bitmap bitmap=(Bitmap)data.getExtras().get("data");
           imageView.setImageBitmap(bitmap);

        }
    }
}