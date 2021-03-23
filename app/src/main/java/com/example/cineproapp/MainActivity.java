package com.example.cineproapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().hide();

        Handler hand = new Handler();
        hand.postDelayed(new Runnable() {
            public void run() {
                pasarActivity();

            }
        }, 3000);
    }

    public void pasarActivity(){
        Intent i = new Intent(this, CineProMx.class);
        startActivity(i);
    }
}
