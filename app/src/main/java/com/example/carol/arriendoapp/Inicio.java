package com.example.carol.arriendoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
    }
    public void Ingresar(View view){
        Intent ingresar = new Intent(this, MenuPropietario.class);

        startActivity(ingresar);
    }
    public void IngresarA(View view){
        Intent ingresar = new Intent(this, InicioArrendatario.class);

        startActivity(ingresar);

    }
    public void Registro(View view){
        Intent ingresar = new Intent(this,Registro.class);

        startActivity(ingresar);
    }
}
