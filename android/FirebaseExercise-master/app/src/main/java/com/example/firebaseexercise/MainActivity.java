package com.example.firebaseexercise;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String mImageUrl = "https://cdn.approveme.com/wp-content/uploads/edd/2014/07/document-activity-notifications.png";
    public static final String CHANNEL_ID = "MyChannel";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setNotificationChannel();
    }

    public void setNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel kChannel = new NotificationChannel(
                    CHANNEL_ID,
                    "Channel",
                    NotificationManager.IMPORTANCE_DEFAULT
            );

            kChannel.setDescription("My FireBase Notification Channel");
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(kChannel);
        }
    }
}
