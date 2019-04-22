package com.example.sociallogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;

public class DetailLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_login);

        Intent intent=getIntent();
        GoogleSignInAccount account=intent.getParcelableExtra("account");

        TextView email=findViewById(R.id.textView);
        email.setText(account.getEmail());
        TextView name=findViewById(R.id.textView2);
        name.setText(account.getDisplayName());
        ImageView imageView=findViewById(R.id.imageView);
        Glide.with(this)
                .load(account.getPhotoUrl())
                .apply(new RequestOptions()).placeholder(R.drawable.ic_launcher_background)
                .into(imageView);


    }
}
