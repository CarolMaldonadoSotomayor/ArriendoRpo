package com.example.carol.arriendoapp.OpcionesPropietarios;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carol.arriendoapp.OpcionesArrendatario.Agregar_Mensaje;
import com.example.carol.arriendoapp.R;

public class MensajesP extends Fragment {

    public MensajesP() {
        // Required empty public constructor
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View vista =inflater.inflate(R.layout.mensajes_propietario, container, false);

        FloatingActionButton fab=(FloatingActionButton)vista.findViewById(R.id.fabMensajeP);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction Fr=getFragmentManager().beginTransaction();
                Fr.replace(R.id.contenedorFracmento,new AgregarMensajeP());
                Fr.commit();
            }
        });
        return vista;
    }
}
