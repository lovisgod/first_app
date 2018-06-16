package com.example.ayo.first_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HymnListActivity extends AppCompatActivity {

    private TextView Hymn_List;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_list);

        Hymn_List = (TextView) findViewById(R.id.list_hymn);
        //this create an array of number
              List<String>items=new ArrayList<String>();
             for(int i=0;i<=999;i++){
                items.add(Integer.toString(i + 1));
             }
    //this populate the text view with the created array
        for (String HymnData : items) {
            Hymn_List.append(HymnData+"  " +"  " );
        }
        Hymn_List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startHymnActivity = new Intent(HymnListActivity.this, MainActivity.class);
                startActivity(startHymnActivity);
            }
        });

        Hymn_List.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(HymnListActivity.this,position, Toast.LENGTH_SHORT).show();
            }
        });

    }
    }

    }



