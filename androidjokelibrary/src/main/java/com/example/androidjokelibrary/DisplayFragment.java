package com.example.androidjokelibrary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.TextViewCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayFragment extends Fragment {
    public static final String KEY = "JOKE";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_display, container, false);
        TextView textView = (TextView) root.findViewById(R.id.textView);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra(KEY);
        if(joke!=null)        textView.setText(joke);
        return root;
    }

}