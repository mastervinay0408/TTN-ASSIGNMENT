package com.example.webservices;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;


public class MainActivity extends AppCompatActivity {
    ConstraintLayout mConstraintLayout;
    private Button glidebutton;
    private Button httpbutton;
    private Button retrofitbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConstraintLayout = findViewById(R.id.const_lay);

        backgroundImage();
        httptask();
        retrofittask();

    }


    public void backgroundImage() {
        glidebutton = findViewById(R.id.glide);
        glidebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Glide.with(MainActivity.this)
                        .load("https://i.stack.imgur.com/7vMmx.jpg")
                        .into(new CustomTarget<Drawable>() {
                            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                            @Override
                            public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                                mConstraintLayout.setBackground(resource);
                            }

                            @Override
                            public void onLoadCleared(@Nullable Drawable placeholder) {

                            }
                        });
            }
        });


    }


    public void httptask() {

        httpbutton = findViewById(R.id.Httpbutton);
        httpbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HttpActivity.class);
                startActivity(intent);
            }
        });


    }


    public void retrofittask() {

        retrofitbutton = findViewById(R.id.retrofitbutton);
        retrofitbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RetrTask.class);
                startActivity(intent);
            }
        });


    }


}
