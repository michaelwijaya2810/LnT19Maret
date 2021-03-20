package com.michaelwijaya.lnt19maret_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.fragment_home, container, false);
        TextView tvHome = root.findViewById(R.id.tv_home);
        EditText etHome = root.findViewById(R.id.et_home);
        Button btnHome = root.findViewById(R.id.btn_home);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etHome.getEditableText().toString();
                tvHome.setText(name);
                Toast.makeText(getActivity(), "Welcome home, "+name, Toast.LENGTH_SHORT).show();
            }
        });

        // Inflate the layout for this fragment
        return root;
    }
}