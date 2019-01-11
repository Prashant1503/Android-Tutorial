package com.example.pintu.dragdroptester;

import android.content.ClipData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1,tv2,tv3,tv4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 =(TextView)findViewById(R.id.tv1);
        tv2 =(TextView)findViewById(R.id.tv2);
        tv3 =(TextView)findViewById(R.id.tv3);
        tv4 =(TextView)findViewById(R.id.tv4);


        tv1.setOnLongClickListener(longClickListener);
        tv2.setOnLongClickListener(longClickListener);

        tv3.setOnLongClickListener(longClickListener);

        tv4.setOnDragListener(dragListener);




    }

    View.OnLongClickListener longClickListener  = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data  = ClipData.newPlainText("","");
            View.DragShadowBuilder myShadowBuilder = new View.DragShadowBuilder(v);
            v.startDrag(data,myShadowBuilder,v,0);

            return true;
        }
    };
    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {
            int dragEvent = event.getAction();

            switch(dragEvent){
                case  DragEvent.ACTION_DRAG_ENTERED:

                    final  View view = (View) event.getLocalState();

                    if(view.getId() == R.id.tv1){
                        tv1.setText("Text view 1 is dragged");
                    }

                    else if (view.getId() == R.id.tv2){
                        tv2.setText("Text view 2 is dragged");

                    }
                    else if (view.getId() == R.id.tv2){
                        tv2.setText("Text view 3 is dragged");

                    }

                    break;

                    case DragEvent.ACTION_DRAG_EXITED:
                        break;

                        case DragEvent.ACTION_DROP:
                            break;
            }

            return true;
        }
    };
}
