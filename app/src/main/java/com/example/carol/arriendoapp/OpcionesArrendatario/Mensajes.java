package com.example.carol.arriendoapp.OpcionesArrendatario;


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
public class Mensajes extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
  View vista =inflater.inflate(R.layout.mensajes_arrendatarios, container, false);
  FloatingActionButton fab=(FloatingActionButton)vista.findViewById(R.id.fabMensajeA);
  fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentTransaction Fr=getFragmentManager().beginTransaction();
          Fr.replace(R.id.ContenedorFArrendatario,new Agregar_Mensaje());
          Fr.commit();
      }
  });

    return vista;
    }

}
