package com.example.pintu.camera2videoimage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Toast;

public class Camera2VideoImageActivity extends AppCompatActivity {

    private TextureView textureView;

    private TextureView.SurfaceTextureListener mSurfaceTexttureListner = new TextureView.SurfaceTextureListener() {
        @Override
        public void onSurfaceTextureAvailable(SurfaceTexture surface, int width, int height) {

            Toast.makeText(getApplicationContext(),"TextureView is available",Toast.LENGTH_LONG).show();

            setUpCamera(width,height);

        }

        @Override
        public void onSurfaceTextureSizeChanged(SurfaceTexture surface, int width, int height) {

        }

        @Override
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surface) {
            return false;
        }

        @Override
        public void onSurfaceTextureUpdated(SurfaceTexture surface) {

        }
    };
     private CameraDevice CameraDevice;
     private CameraDevice.StateCallback CameraDeviceStateCallBack = new CameraDevice.StateCallback() {
         @Override
         public void onOpened(CameraDevice camera) {

             CameraDevice = camera;


         }

         @Override
         public void onDisconnected(CameraDevice camera) {
             camera.close();
             CameraDevice = null;

         }

         @Override
         public void onError(CameraDevice camera, int error) {

             camera.close();
             CameraDevice = null;

         }
     };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera2_video_image);

        textureView =(TextureView)findViewById(R.id.textureView);
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (textureView.isAvailable()){

            setUpCamera(textureView.getWidth(),textureView.getHeight());


        }
        else {
            textureView.setSurfaceTextureListener(mSurfaceTexttureListner);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

        View decorView = getWindow().getDecorView();

        if (hasFocus){

            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
            View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);


        }
    }
    private void setUpCamera(int width,int height){
        CameraManager cameraManager =(CameraManager)getSystemService(Context.CAMERA_SERVICE);

        try{
            for (String CameraID : cameraManager.getCameraIdList()) {

                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(CameraID);

                if (cameraCharacteristics.get(CameraCharacteristics.LENS_FACING) == CameraCharacteristics.LENS_FACING_FRONT){


                    continue;
                }
                String mCameraID = CameraID;
                return;


            }

        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

    }

    private void closeCamera(){
        if (CameraDevice !=null){

            CameraDevice.close();
            CameraDevice = null;
        }
    }
}
