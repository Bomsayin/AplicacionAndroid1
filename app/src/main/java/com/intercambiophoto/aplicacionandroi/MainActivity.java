package com.intercambiophoto.aplicacionandroi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Registrarse(View view){
        Intent i = new Intent(this, registro.class);
        startActivity(i);
    }
    public void IniciarSesion(View view){
        Intent i = new Intent(this, InitioActivity.class);
        startActivity(i);
    }

}