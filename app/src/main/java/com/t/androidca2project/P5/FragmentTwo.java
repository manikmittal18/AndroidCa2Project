package com.t.androidca2project.P5;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.t.androidca2project.R;

public class FragmentTwo extends Fragment {

    private static TextView mTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_fragment_two, container, false);

     //   relativeLayout = view.findViewById(R.id.r);
        mTextView = (TextView) view.findViewById(R.id.textChanged);
        return view;
    }

    public void changeTextProperties(String text) {

        mTextView.setText(text);
    }

}