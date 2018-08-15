package com.example.ayo.first_app;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import static java.net.Proxy.Type.HTTP;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Button mEnglish;
    Button mYoruba;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_main);

        android.support.v7.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout)
                findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle =
                new ActionBarDrawerToggle(this, drawer, toolbar,
                        R.string.navigation_drawer_open,
                        R.string.navigation_drawer_close);
        if (drawer != null) {
            drawer.addDrawerListener(toggle);
        }
        toggle.syncState();
        NavigationView navigationView = (NavigationView)
                findViewById(R.id.nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(this);
        }

        mEnglish = findViewById(R.id.english);
        mEnglish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startHymnActivity = new Intent(MainActivity.this, HymnEnglishActivity.class);
                startActivity(startHymnActivity);
            }
        });

        mYoruba = findViewById(R.id.yoruba);
        mYoruba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startyorubaActivity = new Intent(MainActivity.this, yorubaActivity.class);
                startActivity(startyorubaActivity);
            }
        });
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
// Handle navigation view item clicks here.
        switch (item.getItemId()) {
            /**case R.id.action_lighttheme:
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(getApplicationContext(), "choose light theme", Toast.LENGTH_LONG).show();
                    LinearLayout layout = (LinearLayout) findViewById(R.id.secondpage);
                    layout.setBackgroundResource(R.drawable.whiteback);



                return true;
            case R.id.action_darktheme:
                //this closes the drawer when an option is clicked
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(getApplicationContext(), "choose dark theme", Toast.LENGTH_LONG).show();
                LinearLayout dlayout = (LinearLayout) findViewById(R.id.secondpage);
                dlayout.setBackgroundResource(R.drawable.black);

                return true;**/
            case R.id.nav_aboutmfm:
// Handle the about mfm action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(getApplicationContext(), "about mfm", Toast.LENGTH_LONG).show();
                Intent startChurchProfileActivity = new Intent(MainActivity.this, aboutMfmActivity.class);
                startActivity(startChurchProfileActivity);
                return true;
            case R.id.nav_aboutdeveloper:
// Handle the aboutdeveloper action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(getApplicationContext(), "about developers", Toast.LENGTH_LONG).show();
                Intent startProfileActivity = new Intent(MainActivity.this, profileActivity.class);
                startActivity(startProfileActivity);
                return true;
            case R.id.nav_feed:
// Handle the share action (for now display a toast).
                drawer.closeDrawer(GravityCompat.START);
                Toast.makeText(getApplicationContext(), R.string.feedbackmain, Toast.LENGTH_LONG).show();


                Intent emailIntent = new Intent(Intent.ACTION_SEND);
// The intent does not have a URI, so declare the "text/plain" MIME type
                emailIntent.setType("plain/text");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] {"olifedayo94@gmail.com"}); // recipients
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Let us know what you want us to improve");
                emailIntent.putExtra(Intent.EXTRA_TEXT, "Email message text");
                startActivity(emailIntent);

                return true;
            default:
                return false;

        }
    }

}



