package com.example.notificationpart2.workmanager;

import android.app.Notification;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;

import com.example.notificationpart2.R;
import com.example.notificationpart2.notification.NotificationNormal;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

import static com.example.notificationpart2.channelcreation.ChannelCreation.CHANNEL_1_ID;

public class WorkManagerExample extends Worker {
    NotificationManagerCompat notificationManagerCompat;
//the context of current state of the application/object.
// It lets newly-created objects understand what has been going on.
// Typically you call it to get information regarding another part of your program (activity and package/application).
    Context context;
   // NotificationNormal n1= new NotificationNormal();
//work manager constructor which by default takes 2 parameters
    public WorkManagerExample(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        this.context = context;
    }
//dowork() function should be mendotory as this function is used for calling every time.
    @NonNull
    @Override
    public Result doWork() {
        work(context);

        return Result.success();
    }

    public void work(Context context) {
        notificationManagerCompat = NotificationManagerCompat.from(context);
        Notification notification = new NotificationCompat.Builder(context, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_one)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentTitle("this is work manager")
                .setContentText("this is text")
                .build();
        notificationManagerCompat.notify(1, notification);
    }
}