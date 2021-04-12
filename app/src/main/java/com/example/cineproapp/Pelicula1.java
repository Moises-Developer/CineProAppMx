package com.example.cineproapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Pelicula1 extends AppCompatActivity {

    private ImageButton ibReFa, ibAli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelicula1);

        ibReFa = (ImageButton)findViewById(R.id.ibReFa);
        ibAli = (ImageButton)findViewById(R.id.ibAli);

        ibReFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        ibAli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Pelicula1.this, Comandas.class));
            }
        });
    }
}
