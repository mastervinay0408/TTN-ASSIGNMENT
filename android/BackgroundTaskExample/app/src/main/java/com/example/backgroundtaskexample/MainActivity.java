package com.example.backgroundtaskexample;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String
            DOWNLOAD_URL = "https://atulhost.com/wp-content/uploads/2016/08/indian-flag-hd-wallpapers-images.jpg";

    private static final int PERMISSION_REQUEST_CODE_ASYNC = 111;
    private static final int PERMISSION_REQUEST_CODE_SERVICE = 222;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //handling result of permission dialog
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == PERMISSION_REQUEST_CODE_ASYNC) {     //when permission is taken from async task button
            if (grantResults.length > 0 &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[1] == PackageManager.PERMISSION_GRANTED) {

                //all permissions granted
                Intent intent = new Intent(this, ShowAsyncImage.class);
                intent.putExtra("downloadUrl", DOWNLOAD_URL);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Permissions not granted.", Toast.LENGTH_SHORT).show();
            }
        } else if (requestCode == PERMISSION_REQUEST_CODE_SERVICE) { //when permission is taken from service button
            if (grantResults.length > 0 &&
                    grantResults[0] == PackageManager.PERMISSION_GRANTED &&
                    grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                //all permissions granted
                Intent intent = new Intent(this, ShowServiceImage.class);
                intent.putExtra("downloadUrl", DOWNLOAD_URL);
                startActivity(intent);
            } else {
                Toast.makeText(this, "Permissions not granted.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    //Click handler for download using async task button
    public void asyncTaskclick(View view) {
        //check permissions at run time
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {    //checking if device is android-23 or above
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                    || checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                //checking permissions manually and taking permissions if not granted already
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
                                Manifest.permission.WRITE_EXTERNAL_STORAGE}
                        , PERMISSION_REQUEST_CODE_ASYNC);
            } else {
                Intent intent = new Intent(this, ShowAsyncImage.class);
                intent.putExtra("downloadUrl", DOWNLOAD_URL);
                startActivity(intent);
            }
        } else {        //when device is below android-23
            Intent intent = new Intent(this, ShowAsyncImage.class);
            intent.putExtra("downloadUrl", DOWNLOAD_URL);
            startActivity(intent);
        }

    }

    //Click handler for download using service button
    public void serviceClick(View view) {
        //checking for runtime permissions
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {    //checking if device is android-23 or above
            if (checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                    || checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED) {
                //checking permissions manually and taking permissions if not granted already
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE}, PERMISSION_REQUEST_CODE_SERVICE);
            } else {
                //If permissions already granted
                Intent intent = new Intent(this, ShowServiceImage.class);
                intent.putExtra("downloadUrl", DOWNLOAD_URL);
                startActivity(intent);
            }
        } else {      //when device is below android-23
            Intent intent = new Intent(this, ShowServiceImage.class);
            intent.putExtra("downloadUrl", DOWNLOAD_URL);
            startActivity(intent);
        }
    }
}