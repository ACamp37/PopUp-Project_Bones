// Project is designed to practice Android Core of AAD exam. Dogs pop up to screen followed by button press for Recyclerview
package com.example.popup;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent titleIntent = new Intent(MainActivity.this, HomeScreen.class);
                startActivity(titleIntent);
                finish();
              }
            },SPLASH_TIME_OUT);
       }
   }

