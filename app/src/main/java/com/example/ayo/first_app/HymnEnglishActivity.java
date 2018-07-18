package com.example.ayo.first_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HymnEnglishActivity extends AppCompatActivity {
    /* private RecyclerView.Adapter adapter;


   CHANGED TO HymnAdapter since HymnAdapter extends RecyclerView.Adapter
    */
    private RecyclerView.Adapter adapter;

    private Toast mToast;

    private List<list_item> list_items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_english);
        //   int numberOfColumns=5;
        RecyclerView mRecyclerView = findViewById(R.id.Hymn_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        //Create LinearLayoutManager
        //  mRecyclerView.setLayoutManager(new GridLayoutManager(this,numberOfColumns));
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));


        list_items = new ArrayList<>();
        for (int i = 0; i <= 2000; i++) {
            // this get the arrays of numbers generated and set it according to the get gead and desc
            // methods in the list_item class
            list_item listItem = new list_item(
                    "HYMN " + (i + 1), "this is the description"
            );
            list_items.add(listItem);
        }

        //Create a String resource file for Hymn Items
        // adapter = new HymnAdapter(NUM_LIST_ITEMS);

        adapter = new HymnAdapter(this, list_items);
        mRecyclerView.setAdapter(adapter);


    }
}


