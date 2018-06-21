package com.example.ayo.first_app;

import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class HymnAdapter extends RecyclerView.Adapter<HymnAdapter.ViewHolder> {



    // Changed list type to String[] instead of List
    private String[] listItems;

    //this constructor is created to get the items in listItems
    public HymnAdapter(String[] listItems) {
        this.listItems = listItems;
    }


    @Override
    public HymnAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
       String hymnData = listItems[position];
       holder.hymnText.setText(hymnData);
    }

    @Override
    public int getItemCount() {
        return listItems.length;
    }


    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView hymnText;

        private ViewHolder(View itemView) {
            super(itemView);

            hymnText = itemView.findViewById(R.id.hymn_list);
        }
    }
}
