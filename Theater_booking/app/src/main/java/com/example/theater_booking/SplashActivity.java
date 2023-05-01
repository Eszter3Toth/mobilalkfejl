package com.example.theater_booking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;


public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //start the main after 1 second
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivities(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }
        }, 1000);
    }
}