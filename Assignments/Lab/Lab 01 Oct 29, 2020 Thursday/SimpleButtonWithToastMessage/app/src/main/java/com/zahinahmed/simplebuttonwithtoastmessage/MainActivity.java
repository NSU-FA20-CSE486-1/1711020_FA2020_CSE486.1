package com.zahinahmed.simplebuttonwithtoastmessage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String name = "oishee";

        if (name.equals(null)) {
            Log.e("MainActivity onCreate", "Name is missing");
        }
        else {
            Log.d("MainActivity onCreate", "Wish printed");
        }

        Log.e("MainActivity onCreate", "But you forgot the date!");
    }
}