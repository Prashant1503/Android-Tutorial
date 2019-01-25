package com.example.pintu.sqliteapp;

public class Temp  {

    public static MyDbHandler getMyDbHandler(){
        return myDbHandler;

    }
    public static void setMyDbHandler(MyDbHandler myDbHandler){

        Temp.myDbHandler =myDbHandler;
    }



    public static MyDbHandler myDbHandler;
}
