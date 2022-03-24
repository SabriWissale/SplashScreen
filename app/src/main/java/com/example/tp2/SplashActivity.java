package com.example.tp2;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 4000;
    Animation zoom;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        zoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        img = findViewById(R.id.myImage);
        img.startAnimation(zoom);

        new Handler().postDelayed(new Runnable()
        {
            public void run()
            {
                Intent i = new Intent(SplashActivity.this, FormActivity.class);
                startActivity(i);
                finish();
            }

        }, SPLASH_TIME_OUT);


    }







}
