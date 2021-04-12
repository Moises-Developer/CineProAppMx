package com.example.cineproapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.cineproapp.Modelos.Usuario;

public class CineProMx extends AppCompatActivity {
    Usuario u = new Usuario();
    private Button BTN1;
    private EditText etUsuario, etContrasena;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cine_pro_mx);

        BTN1 = (Button)findViewById(R.id.BotonLogIn);
        etUsuario = (EditText)findViewById(R.id.etUsuario);
        etContrasena = (EditText)findViewById(R.id.etContrasena);

        BTN1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((!etUsuario.getText().toString().equals("")) && (!etContrasena.getText().toString().equals(""))){
                    u.setUser(etUsuario.getText().toString());
                    u.setPassword(etContrasena.getText().toString());
                    if(u.validateUser()){
                        Intent i = new Intent(CineProMx.this, PaginaPrincipal.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(getApplicationContext(), "Usuario o Contraseña Incorrectos", Toast.LENGTH_LONG).show();
                    }
                }else{
                    Toast.makeText(getApplicationContext(), "Los campos estan vacios", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
