package com.example.carol.arriendoapp.Opciones;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.carol.arriendoapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento1 extends Fragment {


    public Fragmento1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragmento1, container, false);
    }

}
