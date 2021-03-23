package com.example.cineproapp;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento2 extends Fragment {

    private ListView LV1;
    private String[] Arreglo = {"ID tarjeta: ", "Dueño de tarjeta: ", "Dinero de tarjeta: ", "Activa"};
    private ArrayList<String> Array = new ArrayList<String>();

    public Fragmento2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle state){
        super.onActivityCreated(state);

        LV1 = (ListView)getView().findViewById(R.id.LV2);
        for (int i = 0; i < 4; i++){
            Array.add(Arreglo[i]);
        }

        MyAdapter myAdapter = new MyAdapter(getContext(), R.layout.list_item_usuario, Array);

        LV1.setAdapter(myAdapter);
    }

}
