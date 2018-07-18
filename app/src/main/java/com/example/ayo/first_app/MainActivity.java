package com.example.ayo.first_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button mEnglish;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEnglish = findViewById(R.id.english);
        mEnglish.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startHymnActivity = new Intent(MainActivity.this,HymnEnglishActivity.class);
                startActivity(startHymnActivity);
            }
        });
    }


}



