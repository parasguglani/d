package com.passionategeekz.noticeboard.ui.tech;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.passionategeekz.noticeboard.R;

public class techFragment extends Fragment {



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_tech, container, false);
        final TextView textView = root.findViewById(R.id.text_dashboard);

        return root;
    }
}
