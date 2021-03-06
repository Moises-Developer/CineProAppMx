package com.example.cineproapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento3 extends Fragment {


    private ListView LV1;
    private Button btnActualizarUsu;
    private String[] Arreglo = {"ID usuario: ", "Nombre: ", "Numero de tarjeta", "Contraseña: "};
    private ArrayList<String> Array =new ArrayList<String>();

    public Fragmento3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragmento3, container, false);
        View view = inflater.inflate(R.layout.fragment_fragmento3, container, false);

        btnActualizarUsu = view.findViewById(R.id.btnActualizarUsu);
        btnActualizarUsu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), ActualizarUsuario.class);
                startActivity(i);
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(Bundle state){
        super.onActivityCreated(state);

        LV1 = (ListView)getView().findViewById(R.id.LV1);
        for (int i = 0; i < 4; i++){
            Array.add(Arreglo[i]);
        }

        MyAdapter myAdapter = new MyAdapter(getContext(), R.layout.list_item_usuario, Array);

        LV1.setAdapter(myAdapter);
    }

}
