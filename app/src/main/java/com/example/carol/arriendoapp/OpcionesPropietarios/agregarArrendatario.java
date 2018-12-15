package com.example.carol.arriendoapp.OpcionesPropietarios;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carol.arriendoapp.R;

public class agregarArrendatario extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista= inflater.inflate(R.layout.agregar_arrendatario, container, false);
        FloatingActionButton fab=(FloatingActionButton) vista.findViewById(R.id.fab_deudas);
         fab.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 FragmentTransaction FR=getFragmentManager().beginTransaction();
                 FR.replace(R.id.contenedorFracmento,new Deudas());
                 FR.commit();
             }
         });




        return vista;
    }



}
