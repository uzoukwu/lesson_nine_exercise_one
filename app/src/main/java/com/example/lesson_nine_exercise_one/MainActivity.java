package com.example.lesson_nine_exercise_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("myLog", "main thread started");
        new MyThread ();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Log.d("myLog", "main thread restarted");

        Thread myThread;
        myThread =  Thread.currentThread();
        Log.d("myLog", "Current Thread: " + myThread);
        myThread.setName("The MAIN");
        try {
            myThread.sleep(5000);
        }catch (InterruptedException ei) {
            ei.printStackTrace();
        }Log.d("myLog", "Renamed: " + myThread);


    }

}