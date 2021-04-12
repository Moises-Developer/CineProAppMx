package com.example.cineproapp;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.cineproapp.PaginaPrincipal;

/**
 * A simple {@link Fragment} subclass.
 */
public class Fragmento1 extends Fragment {

    private ImageButton ibFast, ibTransformers, ibSky, ibJoker;

    public Fragmento1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_fragmento1, container, false);
        View view = inflater.inflate(R.layout.fragment_fragmento1, container, false);
        ibFast = view.findViewById(R.id.ibFast);
        ibTransformers = view.findViewById(R.id.ibTransformers);
        ibSky = view.findViewById(R.id.ibSky);
        ibJoker = view.findViewById(R.id.ibJoker);

        ibFast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(),Pelicula1.class);
                startActivity(i);
            }
        });

        ibTransformers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Pelicula2.class);
                startActivity(i);
            }
        });

        ibSky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Pelicula3.class);
                startActivity(i);
            }
        });

        ibJoker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), Pelicula4.class);
                startActivity(i);
            }
        });

        return view;
    }

}
