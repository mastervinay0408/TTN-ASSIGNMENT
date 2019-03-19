package com.example.notificationpart2;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Timer;

import static com.example.notificationpart2.App.CHANNEL_1_ID;
import static com.example.notificationpart2.App.CHANNEL_2_ID;

public class Notification_normal extends AppCompatActivity  {
    //creating NotificationManagerCompat istead of NotificationManager as NotificationManagerCompat
    //gives Compatibility library for NotificationManager with fallbacks for older platforms.
    private static NotificationManagerCompat notificationManagerCompat;
    private static EditText editText;
    private static EditText editText1;
    private static Button channel1;
    private static Button channel2;
    private static Button start;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notification_normal);
        notificationManagerCompat = NotificationManagerCompat.from(this);
        editText = findViewById(R.id.editText);
        editText1 = findViewById(R.id.editText2);
        channel1 = findViewById(R.id.button3);
        channel2 = findViewById(R.id.button4);
        sendOnChannel();
        sendOnChanne2();
        onclickstart();

    }



    static void sendOnChannel() {
        final String tittle = editText.getText().toString();
        final String message = editText1.getText().toString();

        channel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               call1(v.getContext());
            }
        });
    }



    public static void call1(Context context){
//        if()
        String tittle = editText.getText().toString();
        String message = editText1.getText().toString();
        //creating Notification and passing channel into them and if the version is lower than oreo
        //then CHANNEL_id is not passed through  it
        Notification notification = new NotificationCompat.Builder(context, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_one)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentTitle(tittle)
                .setContentText(message)
                .build();
        //giving differtent id to channel as is same id is present then notification will overwrite
        //for getting different notification we have to  give different channnel Id to them,
        // notification is passed through them as notification is display over the screen
        notificationManagerCompat.notify(1, notification);
    }


// this method is used for Work manager which is call when the dowork function is called
    // in dowork we passed work() method.
    public static void work(Context context){
        notificationManagerCompat = NotificationManagerCompat.from(context);
        Notification notification = new NotificationCompat.Builder(context, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_one)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentTitle("this is work manager")
                .setContentText("this is text")
                .build();
        notificationManagerCompat.notify(1, notification);
    }





//method for calling button2
    public static void sendOnChanne2() {


        channel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                call2(v.getContext());
            }
        });


    }


    public static void call2(Context context){
        final String tittle = editText.getText().toString();
        final String message = editText1.getText().toString();
        Notification notification = new NotificationCompat.Builder(context, CHANNEL_1_ID)
                .setSmallIcon(R.drawable.ic_one)
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setContentTitle("this is notification2")
                .setContentText(message)
                .build();
        notificationManagerCompat.notify(2, notification);
    }









// this is a method for calling alternative channel notification after every-one minute

    public void onclickstart() {
        Button start = findViewById(R.id.button5);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Timer t1 = new Timer();
                t1.schedule(new Timer1(v.getContext()), 0, 7000);

            }
        });


    }

}


