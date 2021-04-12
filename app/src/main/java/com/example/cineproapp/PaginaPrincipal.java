package com.example.cineproapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PaginaPrincipal extends AppCompatActivity {

    private BottomNavigationView navegador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        navegador = (BottomNavigationView)findViewById(R.id.Bottom_nav);

        navegador.setOnNavigationItemSelectedListener(bottomNavMethod);

        getSupportFragmentManager().beginTransaction().replace(R.id.contenedor,new Fragmento1()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            Fragment fragment = null;

            switch (menuItem.getItemId()){
                case R.id.Home:
                    fragment = new Fragmento1();
                    break;
                case R.id.Efectivo:
                    fragment = new Fragmento2();
                    break;
                case R.id.Usuario:
                    fragment = new Fragmento3();
                    break;
                default:

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.contenedor, fragment).commit();
            return true;
        }
    };

    public void CambioFragmento(){
        startActivity(new Intent(PaginaPrincipal.this, Pelicula1.class));
    }

}
