package com.example.pintu.quizapp;

public class QuestionLibrary {

    private String mQuestions [] = {
            "What is the science of colors?",
            "The atmosphere is held to the earth by _?",
            "Who was the first to study the solar system?",
            " HTML stands for?",
            "Where is the Statue of Liberty situated?",
            "Which is the world’s most visited site?"
    };
    private String mChoices [][] = {
            {" Chromatics","Red","Blue"},
            {"Gravity","Gravitational Force","Atmospheric Pressure"},
            {" Isaac Newton","Sir Issac Newton","Wright Brothers"},
            {"HyperTextMarkup Language","Hypertext and Markup Language","Hyper and Text Markup Language"},
            {"New York City in US","Belgium","Australia"},
            {"Effiel Tower","Signature Bridge","Karnavati Pool"},

    };
    private  String mCorrectAnswer [] = {"Chromatics","Gravity","Issac Newton","HyperTextMarkup Language","New York City in US",
                                          "Effiel Tower"
    };

    public String getQuestion(int a){
        String question= mQuestions[a];
        return question;
    }
    public String getChoice0(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice1(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }
    public String getChoice2(int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getChoice3(int a){
        String choice3 = mChoices[a][3];
        return choice3;
    }
    public String getChoice4(int a){
        String choice4 = mChoices[a][4];
        return choice4;
    }
    public String getChoice5(int a){
        String choice5 = mChoices[a][5];
        return choice5;
    }

    public String getCorrectAnswer(int a){
        String answer  =mCorrectAnswer[a];
        return answer;
    }


}
