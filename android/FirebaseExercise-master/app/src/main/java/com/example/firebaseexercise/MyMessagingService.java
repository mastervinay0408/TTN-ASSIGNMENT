package com.example.firebaseexercise;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.util.Log;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import static com.example.firebaseexercise.DisplayResultActivity.DEFAULT_IMAGE_URL;
import static com.example.firebaseexercise.MainActivity.CHANNEL_ID;

public class MyMessagingService extends FirebaseMessagingService {
    public static final String TAG = "MyMessagingService";
    private NotificationCompat.Builder mNotificationCompatBuilder;

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        String kPrice = remoteMessage.getData().get("PRICE");
        String kImageUrl = remoteMessage.getData().get(Constants.IMAGE_URL);
        Log.i(TAG, remoteMessage.getData().get("PRICE"));

        Bundle kBun = setBundle(kImageUrl, kPrice);

        showNotification(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody(), kBun);
    }

    //set notification
    private void showNotification(final String iTitle, final String iMessage, Bundle iBundle) {
        Intent intent = new Intent(this, DisplayResultActivity.class);
        intent.putExtras(iBundle);
        final PendingIntent kPendingIntent = PendingIntent.getActivity(
                this,
                0,
                intent,
                PendingIntent.FLAG_ONE_SHOT);
        createNotificationWithImage(iBundle, iTitle, iMessage, kPendingIntent);
    }

    private void createNotificationWithImage(Bundle iBun, final String iTitle, final String iMessage, final PendingIntent iPendingIntent) {
        Glide.with(getApplicationContext())
                .asBitmap()
                .load(iBun.getString(Constants.IMAGE_URL, DEFAULT_IMAGE_URL))
                .into(new CustomTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(@NonNull Bitmap resource, @Nullable Transition<? super Bitmap> transition) {
// creating Notification
                        mNotificationCompatBuilder = new NotificationCompat.Builder(getApplicationContext(), CHANNEL_ID)
                                .setContentTitle(iTitle)
                                .setContentText(iMessage)
                                .setSmallIcon(R.drawable.ic_audiotrack_black_24dp)
                                .setContentIntent(iPendingIntent)
                                .setStyle(new NotificationCompat.BigPictureStyle().bigPicture(resource))
                                .setAutoCancel(true);

                        NotificationManagerCompat kManagerCompat = NotificationManagerCompat.from(getApplicationContext());
                        kManagerCompat.notify(999, mNotificationCompatBuilder.build());
                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {

                    }
                });
    }

    //set data in bundle for pending intent
    private Bundle setBundle(String iImageUrl, String iPrice) {
        Bundle kBundle = new Bundle();
        kBundle.putString("IMAGE_URL", iImageUrl);
        kBundle.putString("PRICE", iPrice);

        return kBundle;
    }
}
