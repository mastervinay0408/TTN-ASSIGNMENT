package com.example.notificationpart2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.notificationpart2.notification.NotificationNormal;
import com.example.notificationpart2.workmanager.WorkManagerExample;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
// this is the main activity
public class MainActivity extends AppCompatActivity {
    OneTimeWorkRequest request = new OneTimeWorkRequest.Builder(WorkManagerExample.class).build();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        notificationchannel();
        workmanager();

    }

    private void notificationchannel()
    {
        Button button = findViewById(R.id.main1);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this, NotificationNormal.class);
               startActivity(intent);
           }
       });

    }

    private void workmanager()
    {
        Button button = findViewById(R.id.main2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                WorkManager.getInstance().enqueue(request);

            }
        });

    }









}

