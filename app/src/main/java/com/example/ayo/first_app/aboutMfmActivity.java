package com.example.ayo.first_app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class aboutMfmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_mfm);

        ImageView churchProfile = (ImageView)findViewById(R.id.churchprofile);

        Bitmap bitmapChurchProfile = BitmapFactory.decodeResource(getResources(), R.drawable.mfm);

        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmapChurchProfile);
        mDrawable.setCircular(true);

        //Lastly you can set the image with the circle shape to the ImageView

        churchProfile.setImageDrawable(mDrawable);
    }
}
