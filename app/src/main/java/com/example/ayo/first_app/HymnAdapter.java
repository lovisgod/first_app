package com.example.ayo.first_app;

import android.app.LauncherActivity;
import android.content.Context;
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

    private static final String TAG = HymnAdapter.class.getSimpleName();

    //final private ListItemClickListener mOnClickListener;

    private Context context;

    private List<list_item> list_items;


    public HymnAdapter( Context context, List<list_item> list_items) {
        //this.mOnClickListener = mOnClickListener;
        this.context = context;
        this.list_items = list_items;
    }






    public interface ListItemClickListener {
        void onListItemClick(int itemId);
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        list_item listItem = list_items.get(position);

        holder.textViewHymn.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());
    }

    @Override
    public int getItemCount() {
        return list_items.size();
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewHymn;
        private TextView textViewDesc;

        private ViewHolder(View itemView) {
            super(itemView);

            textViewHymn = (TextView)itemView.findViewById(R.id.textViewHymn);
            textViewDesc = (TextView)itemView.findViewById(R.id.textViewDesc);
        }



      //  @Override
       // public void onClick(View v) {
         //   int clickedPosition = getAdapterPosition();
         //   mOnClickListener.onListItemClick(clickedPosition);
       // }
    }
}
