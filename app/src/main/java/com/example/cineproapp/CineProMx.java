package com.example.cineproapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CineProMx extends AppCompatActivity {

    private Button BTN1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine_pro_mx);

        BTN1 = (Button)findViewById(R.id.BotonLogIn);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(CineProMx.this, PaginaPrincipal.class);
                startActivity(i);
            }
        });
    }
}
