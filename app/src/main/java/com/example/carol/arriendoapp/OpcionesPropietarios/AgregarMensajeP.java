package com.example.carol.arriendoapp.OpcionesPropietarios;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carol.arriendoapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AgregarMensajeP extends Fragment {


    public AgregarMensajeP() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista= inflater.inflate(R.layout.agregar_mensaje_propietario, container, false);


        return vista;
    }

}
