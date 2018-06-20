package com.example.ayo.first_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;

public class HymnListActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    // COMPLETED (35) Add a private ForecastAdapter variable called mForecastAdapter
    //private ForecastAdapter mForecastAdapter;
    private RecyclerView.Adapter adapter;

   // private TextView Hymn_List;

    private List<String> ListItems = new ArrayList<String>();






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_list);
        //Hymn_List = (TextView)findViewById(R.id.hymn_list);

        mRecyclerView = (RecyclerView) findViewById(R.id.Hymn_recycler);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        mRecyclerView.setLayoutManager(layoutManager);
            for (int i=0;i<=999;i++){
               ListItems.add(Integer.toString(i+1));

            }

         /* for (String HymnData :ListItems){
                Hymn_List.append(HymnData+"  " +"  ");
            }*/
        adapter = new HymnAdapter(ListItems);
        mRecyclerView.setAdapter(adapter);

     /*   Hymn_List = (TextView) findViewById(R.id.list_hymn);
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
        });*/

       /* Hymn_List.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                Toast.makeText(HymnListActivity.this, position, Toast.LENGTH_SHORT).show();
            }
        });*/
        //mForecastAdapter = new ForecastAdapter();

        //mRecyclerView.setAdapter(mForecastAdapter);

    }


    }





