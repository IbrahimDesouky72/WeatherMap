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

public class BookMarksFragment extends Fragment {
    View view;
    public BookMarksFragment(){}

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.book_marks,container,false);
        return view;
    }
}
