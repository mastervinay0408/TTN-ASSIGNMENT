package com.example.databinding;

import android.app.Activity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.database.DatabaseUtils;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.databinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends AppCompatActivity {

    List<User> users = new ArrayList<>();
    private ActivityMainBinding mainBinding;
    ViewModelExample modelExample;
    ConstraintLayout mconstraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        modelExample = ViewModelProviders.of(this).get(ViewModelExample.class);
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mconstraintLayout=mainBinding.constraint;
        mconstraintLayout.setBackgroundColor( modelExample.color);
        Log.i("message","create");


        mainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databinding();
            }
        });
        mainBinding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewmodel();
            }
        });



    }

    public void databinding() {

        Intent intent = new Intent(MainActivity.this, DataBinding.class);
        startActivity(intent);
    }


    public void viewmodel() {

        Random random = new Random();
        modelExample.color= Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));
        mconstraintLayout.setBackgroundColor( modelExample.color);



    }
}