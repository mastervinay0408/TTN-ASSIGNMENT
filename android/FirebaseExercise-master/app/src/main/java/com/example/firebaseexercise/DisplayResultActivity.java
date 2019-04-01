package com.example.firebaseexercise;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;

public class DisplayResultActivity extends AppCompatActivity {
    private TextView mPrice;
    private ImageView mImage;
    //    set default image if image not fetched from url
    public static final String DEFAULT_IMAGE_URL = "https://icap.ac.cr/wp-content/themes/highstand/assets/images/default.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_result);

        mImage = findViewById(R.id.iv_image);
        mPrice = findViewById(R.id.tv_price);
        Bundle bundle = getIntent().getExtras();
        mPrice.setText(bundle.getString("PRICE", "$0"));
        setImageFromUrl(mImage, bundle.getString("IMAGE_URL", DEFAULT_IMAGE_URL));
    }

   /* Glide.with(this)
            .asBitmap()
        .load(path)
        .into(new SimpleTarget<Bitmap>() {
        @Override
        public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
            imageView.setImageBitmap(resource);
        }
    });*/

    public static void setImageFromUrl(final ImageView iImageFromUrl, String iUrl) {
        Context kContext = iImageFromUrl.getContext();
        if (kContext != null) {
            Glide.with(kContext)
                    .asBitmap()
                    .load(iUrl)
                    .into(new CustomTarget<Bitmap>() {
                        @Override
                        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable Transition<? super Bitmap> transition) {
                            iImageFromUrl.setImageBitmap(bitmap);
                        }

                        @Override
                        public void onLoadCleared(@Nullable Drawable placeholder) {

                        }
                    });
        }
    }
}
