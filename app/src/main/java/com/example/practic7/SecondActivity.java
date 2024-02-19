package com.example.practic7;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecondActivity extends Fragment {

    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        // return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.second_tab, container, false);
    }
}