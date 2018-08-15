package com.example.ayo.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class detailActivity extends AppCompatActivity {

    private TextView hymndata;
    private String hymnName;
    private TextView hymncontent;
    private String hymmnFull;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail);

        hymndata = (TextView) findViewById(R.id.hymndata);
        hymncontent = (TextView)findViewById(R.id.hymncontent);
        //Intent intentThatStartedThisActivity = getIntent();


        // COMPLETED (2) Display the weather forecast that was passed from MainActivity
        /**if (intentThatStartedThisActivity != null) {
            if (intentThatStartedThisActivity.hasExtra("Extra Text")) {
                hymnName= intentThatStartedThisActivity.getStringExtra("Extra Text");
                hymndata.setText(hymnName);
            }
        }**/
        hymndata.setText(getIntent().getExtras().getString("tEXTvALUE"));
        hymnName= hymndata.getText().toString();
        hymncontent.setText(getIntent().getExtras().getString("tEXTvALUE2"));
        hymmnFull = hymncontent.getText().toString();
    }
}
