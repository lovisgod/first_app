package com.example.ayo.first_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HymnListActivity extends AppCompatActivity {

    private TextView Hymn_List;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_list);

        Hymn_List = (TextView) findViewById(R.id.list_hymn);
              List<String>items=new ArrayList<String>();
             for(int i=0;i<=999;i++){
                items.add(Integer.toString(i + 1));
             }
        for (String HymnData : items) {
            Hymn_List.append(HymnData+" " +" " );
        }
    }

    }



