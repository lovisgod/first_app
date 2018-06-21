package com.example.ayo.first_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HymnEnglishActivity extends AppCompatActivity {
     /* private RecyclerView.Adapter adapter;


    CHANGED TO HymnAdapter since HymnAdapter extends RecyclerView.Adapter
     */
    private HymnAdapter adapter;

    //Used an Array of string for listItems for simplification
    public String[] listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hymn_english);

        RecyclerView mRecyclerView = findViewById(R.id.Hymn_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        //Create LinearLayoutManager
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);

        //Set LayoutManager to recyclerview
        mRecyclerView.setLayoutManager(layoutManager);

        //Create a String resource file for Hymn Items
        listItems = getResources().getStringArray(R.array.hymnItems);

        adapter = new HymnAdapter(listItems);
        mRecyclerView.setAdapter(adapter);

    }
}
