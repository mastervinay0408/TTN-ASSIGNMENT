package com.example.notificationpart2.notification;

import android.content.Context;
import android.util.Log;

import com.example.notificationpart2.notification.NotificationNormal;

import java.util.TimerTask;


/*class used for calling notification alternatively*/
public class PeriodicCallByTimer extends TimerTask {

    Context context;

    public PeriodicCallByTimer(Context context){
        this.context = context;
    }
        int counter=1;
    NotificationNormal n1= new NotificationNormal();
    @Override
    public void run() {

        if(counter==1)
        {
            n1.call1(this.context);
            Log.v("vinay", "1");
            counter=0;


        }
        else if(counter==0)
        {
          n1.call2(this.context);
            Log.v("vinay", "2");
            counter=1;
        }

    }
}
