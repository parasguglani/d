package com.passionategeekz.noticeboard.ui.world;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.passionategeekz.noticeboard.R;

public class worldFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_world, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);

        return root;
    }
}

