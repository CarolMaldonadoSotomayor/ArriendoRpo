package com.example.carol.arriendoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }
    public void Ingresar(View view){
        Intent ingresar = new Intent(this, MainActivity.class);

        startActivity(ingresar);
    }
}
