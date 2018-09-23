package com.example.ibrahimdesouky.weathermap;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by IbrahimDesouky on 9/21/2018.
 */

public class MapFragment extends Fragment {
    View view;
    public MapFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.map_fragment,container,false);
        return view;
    }
}
