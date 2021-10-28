package com.example.lesson_nine_exercise_one;

import android.util.Log;

public class MyThread implements Runnable{
    public MyThread(){
        new Thread(this).start();
    }

    @Override
    public void run(){
        Log.d("myLog", "Background thread started...");
        try{
            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        Log.d("myLog", "Background thread ended.");
    }



}
