package com.example.pintu.downloadmanagerdemo;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    long queueid;
    DownloadManager dm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BroadcastReceiver receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();

                if (DownloadManager.ACTION_DOWNLOAD_COMPLETE.equals(action)) {
                    DownloadManager.Query requestquery = new DownloadManager.Query();
                    requestquery.setFilterById(queueid);


                    Cursor c = dm.query(requestquery);

                    if(c.moveToFirst()){
                        int columnIndex = c.getColumnIndex(DownloadManager.COLUMN_STATUS);

                        if(DownloadManager.STATUS_SUCCESSFUL == c.getInt(columnIndex)){

                            VideoView videoView = (VideoView)findViewById(R.id.videoView);
                            String uriString = c.getString(c.getColumnIndex(DownloadManager.COLUMN_LOCAL_URI));

                            MediaController mediaController = new MediaController(getApplicationContext());
                            mediaController.setAnchorView(videoView);
                            videoView.setVideoURI(Uri.parse(uriString));
                            videoView.start();
                        }
                    }




                }

            }


        };

        registerReceiver(receiver,new IntentFilter(DownloadManager.ACTION_DOWNLOAD_COMPLETE));
    }
    public void Download_Click(View v){
        dm =(DownloadManager)getSystemService(DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse("https://www.youtube.com/watch?v=Dj_28XSj8Mg"));

        queueid =dm.enqueue(request);
    }
    public void View_Click(View v){
        Intent i = new Intent();
        i.setAction(DownloadManager.ACTION_VIEW_DOWNLOADS);
        startActivity(i);
    }
}
