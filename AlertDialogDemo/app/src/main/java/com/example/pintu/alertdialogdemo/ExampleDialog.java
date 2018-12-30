package com.example.pintu.alertdialogdemo;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ExampleDialog extends AppCompatDialogFragment {
    Button positive,negative,neutral;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        positive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Information");
                builder.setMessage("Positve action button");
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getContext(), "Positive button clicked", Toast.LENGTH_SHORT).show();
                    }

                    ;
                });
                builder.show();


            }
        });


    }
}

