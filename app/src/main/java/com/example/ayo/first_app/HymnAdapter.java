package com.example.ayo.first_app;

import android.app.LauncherActivity;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class HymnAdapter extends RecyclerView.Adapter<HymnAdapter.ViewHolder> {




    private List<String> listItems;

    //this constructor is created to get the items in ListItems
    public HymnAdapter(List<String> listItems) {
        this.listItems = listItems;
    }


    @Override
    public HymnAdapter.ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
       String hymnData = listItems.get(position);
       holder.hymnText.setText(hymnData);
    }

    @Override
    public int getItemCount() {
        return listItems.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView hymnText;

        public ViewHolder(View itemView) {
            super(itemView);

            hymnText = (TextView) itemView.findViewById(R.id.hymn_list);
        }
    }

}
