package com.vivianaranha.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by vivianaranha on 12/7/15.
 */
public class FragmentA extends Fragment {

    int count = 0;
    FragmentB.Counter counter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Button b = (Button) view.findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                MainActivity mainActivity= (MainActivity) getActivity();
                counter = (MainActivity) getActivity();
                counter.incrementValue(count);
            }
        });

        return view;
    }

}
