package com.example.notificationpart2.channelcreation;

import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.support.annotation.RequiresApi;

/*this class is used for creating channels which extends Application as it creates inside Application(manifest)*/

public class ChannelCreation extends Application {
//creating them final so that it cannot be changed further
    public static final String CHANNEL_1_ID="channel1";
    public static final String CHANNEL_2_ID="channel2";
//as channel starts from oreo version so it gives requireApi
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public void onCreate() {
        super.onCreate();
        createNotificationChannels();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void createNotificationChannels(){
//checking version which shoul be greater than oreo version ,as channel started from oreo 8.0 version
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O) {
            NotificationChannel channel1 = new NotificationChannel(
                    CHANNEL_1_ID, "channel1", NotificationManager.IMPORTANCE_HIGH);

            channel1.setVibrationPattern(new long[]{100,200});
            channel1.setDescription("THIS IS CHANNEL1");


            NotificationChannel channel2 = new NotificationChannel(
                    CHANNEL_2_ID, "channel2", NotificationManager.IMPORTANCE_LOW);

            channel2.setVibrationPattern(new long[]{100,200});
            channel2.setDescription("THIS IS CHANNEL1");

//creating a manager as all managing of channel is done by manager
            NotificationManager manager = getSystemService(NotificationManager.class);
            manager.createNotificationChannel(channel1);
            manager.createNotificationChannel(channel2);
        }
    }











}







