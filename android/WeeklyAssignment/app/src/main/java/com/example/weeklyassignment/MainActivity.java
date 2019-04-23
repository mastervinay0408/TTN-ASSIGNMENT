package com.example.weeklyassignment;

import android.content.Intent;
import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    FragmentManager mFragmentManager;
    FragmentTransaction mFragmentTransaction;
    SplashFragment splashFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mFragmentManager = getSupportFragmentManager();
        mFragmentTransaction = mFragmentManager.beginTransaction();
        mFragmentTransaction.add(R.id.frameLayout, new SplashFragment()).addToBackStack(null);
        mFragmentTransaction.commit();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mFragmentManager.popBackStack();
                login();

            }
        }, 2000);

    }

    private void login() {
        Button button_login=findViewById(R.id.button);
        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AfterLogin.class);
                startActivity(intent);
            }
        });
    }
}
