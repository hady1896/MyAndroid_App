package com.example.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class DataFragment extends Fragment {
TextView snt;

    public DataFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String sent = getArguments().getString("nm");
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_data, container, false);;
        snt=view.findViewById(R.id.senttxt);
        snt.setText(sent);
        return view;
    }

}
