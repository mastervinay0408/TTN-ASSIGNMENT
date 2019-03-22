package com.example.exercise5.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.exercise5.R;

public class Fragment1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.d("Exercise5", "Activity:onCreateView()");
        return inflater.inflate(R.layout.fragment1, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.d("Exercise5", "Fragment:onAttach()");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("Exercise5", "Fragment:onActivityCreated()");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("Exercise5", "Fragment:onStart()");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("Exercise5", "Fragment:onResume()");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("Exercise5", "Fragment:onPause()");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("Exercise5", "Fragment:onStop()");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.d("Exercise5", "Fragment:onDestroyView()");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Exercise5", "Fragment:onDestroy()");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.d("Exercise5", "Fragment:onDetach()");
    }
}
