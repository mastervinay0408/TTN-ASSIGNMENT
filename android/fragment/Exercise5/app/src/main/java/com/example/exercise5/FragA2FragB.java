package com.example.exercise5;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FragA2FragB extends AppCompatActivity {

    FragmentManager manager;
    FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frag_a_2_frag_b);

        manager = getSupportFragmentManager();
        transaction = manager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        FragmentB fragmentB = new FragmentB();
        transaction.add(R.id.fragment_container_1, fragmentA);
        transaction.add(R.id.fragment_container_2, fragmentB);
        transaction.commit();

        fragmentA.setICommunicator(fragmentB);

    }
}
