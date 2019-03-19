package com.example.notificationpart2;

import android.content.Context;
import android.support.annotation.NonNull;

import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class WorkManagerExample extends Worker {
//the context of current state of the application/object.
// It lets newly-created objects understand what has been going on.
// Typically you call it to get information regarding another part of your program (activity and package/application).
    Context context;
//work manager constructor which by default takes 2 parameters
    public WorkManagerExample(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        this.context = context;
    }
//dowork() function should be mendotory as this function is used for calling every time.
    @NonNull
    @Override
    public Result doWork() {
        Notification_normal.work(context);
        return Result.success();
    }
}
