package com.example.backgroundtaskexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class NetReciever extends BroadcastReceiver {
    static INetStateChange iNetStateChange;

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnectedOrConnecting()) {
            //when network connectivity is valid, it calls our network state listener and tells it that network connection is established
            Toast.makeText(context, "Internet is connected.", Toast.LENGTH_SHORT).show();
            iNetStateChange.mOnStateChange(true);
        } else {
            //when network connectivity fails, it calls our network state listener and tells it that network connection is failed
            Toast.makeText(context, "Internet is disconnected.", Toast.LENGTH_SHORT).show();
            iNetStateChange.mOnStateChange(false);
        }
    }


    public static void setConnectivityListener(NetReciever.INetStateChange iNetStateChangeOb) {
        //this method is used to instantiate connectivity listener
        iNetStateChange = iNetStateChangeOb;
    }

    //using interface as bridge to communicate
    public interface INetStateChange {
        //customized method to listen network connectivity events
        void mOnStateChange(boolean isConnected);
    }


}
