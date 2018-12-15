package com.example.carol.arriendoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InicioArrendatario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio_arrendatario);
    }
    public void MunuArrendatario(View v){
        Intent Ingresar= new Intent( this,MenuArrendatario.class);
        startActivity(Ingresar);

    }
}
