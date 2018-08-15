package com.example.ayo.first_app;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);


        ImageView profile = (ImageView)findViewById(R.id.profile);
        ImageView profile2 = (ImageView)findViewById(R.id.profile2);

        //Next you need to use RoundedBitmapDrawable to change the shape of the image to circle,
        // this method takes a Bitmap and makes it circle
        Bitmap bitmapProfile = BitmapFactory.decodeResource(getResources(), R.drawable.profile);

        // Once you get the Bitmap, you can then use RoundedBitmapDrawable


        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmapProfile);
        mDrawable.setCircular(true);

        //Lastly you can set the image with the circle shape to the ImageView

        profile.setImageDrawable(mDrawable);
        profile2.setImageDrawable(mDrawable);



    }
}
