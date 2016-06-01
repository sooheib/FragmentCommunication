package com.vivianaranha.fragmentcommunication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentB.Counter{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void incrementValue(int count) {
        FragmentB fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragmentb);
        fragmentB.setTheCount(count);
    }
}
