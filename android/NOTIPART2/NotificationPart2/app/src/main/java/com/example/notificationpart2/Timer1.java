package com.example.notificationpart2;

import android.content.Context;
import android.util.Log;

import java.sql.Time;
import java.util.TimerTask;


//class used for calling notification alternatively
public class Timer1 extends TimerTask {

    Context context;

    public Timer1(Context context){
        this.context = context;
    }
        int counter=1;

    @Override
    public void run() {

        if(counter==1)
        {
            Notification_normal.call1(this.context);
            Log.v("vinay", "1");
            counter=0;


        }
        else if(counter==0)
        {
          Notification_normal.call2(this.context);
            Log.v("vinay", "2");
            counter=1;
        }

    }
}
