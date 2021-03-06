package com.vivianaranha.fragmentcommunication;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by vivianaranha on 12/7/15.
 */
public class FragmentB extends Fragment {

    TextView textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;
    }

    public void setTheCount(int count){
        textView.setText("Count: "+ count);
    }

    public interface Counter{
        public void incrementValue(int count);
    }

}
