package com.unip.oitavosemestre.tcc.apptcc.activity.ui.equipe;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.unip.oitavosemestre.tcc.apptcc.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class EquipeFragment extends Fragment {


    public EquipeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_equipe, container, false);


        return view;

    }

}
