package com.example.pintu.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public abstract class MainActivity extends AppCompatActivity {
    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    updateQuesiton();

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mScoreView =(TextView)findViewById(R.id.score);
        mQuestionView =(TextView)findViewById(R.id.question);
        mButtonChoice1 =(Button)findViewById(R.id.choice1);
        mButtonChoice2 =(Button)findViewById(R.id.choice2);
        mButtonChoice3 =(Button)findViewById(R.id.choice3);



        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mButtonChoice1.getText() == mAnswer){
                    mScore = mScore +1;
                    updateScore(mScore);
                    updateQuesiton();


                    Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this,"Wrong",Toast.LENGTH_SHORT).show();
                    updateQuesiton();
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View v) {
                                                  if (mButtonChoice2.getText() == mAnswer) {
                                                      mScore = mScore + 1;
                                                      updateScore(mScore);
                                                      updateQuesiton();


                                                      Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                                                  } else {
                                                      Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                                                      updateQuesiton();

                                                  };
                                              };
                                          });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuesiton();


                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    updateQuesiton();
                }
            }

            public void updateQuesiton() {
                mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));

                mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
                mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
                mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

                mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
                mQuestionNumber++;

            }

            public void updateScore(int point) {
                mScoreView.setText(" " + mScore);
            }
        });
    }
}