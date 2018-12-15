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
public class ListaArrendatarios extends Fragment {

    public ListaArrendatarios() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View vista=inflater.inflate(R.layout.lista_arrendatarios, container, false);
    FloatingActionButton fab =(FloatingActionButton) vista.findViewById(R.id.BtnFlotante);
  fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
          FragmentTransaction FR=getFragmentManager().beginTransaction();
          FR.replace(R.id.contenedorFracmento,new agregarArrendatario());
          FR.commit();
      }
  });

        return vista;

    }


}
