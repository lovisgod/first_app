package com.example.ayo.first_app;

import android.app.LauncherActivity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HymnAdapter extends RecyclerView.Adapter<HymnAdapter.ViewHolder> implements Filterable  {

    private static final String TAG = HymnAdapter.class.getSimpleName();

    private Context context;

    private List<list_item> list_items;

    private List<list_item> filteredList;

    public HymnAdapter( Context context, List<list_item> list_items) {
        this.context = context;
        this.list_items = list_items;
        this.filteredList = list_items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        final list_item listItem = filteredList.get(position);
        holder.textViewHymn.setText(listItem.getHead());
        holder.textViewDesc.setText(listItem.getDesc());
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, detailActivity.class);
                intent.putExtra("tEXTvALUE", "MFMHB  | " + listItem.getHead());
                intent.putExtra("tEXTvALUE2", "" + listItem.getDesc());
                context.startActivity(intent);

            }


        });

    }


    @Override
    public int getItemCount() {
        return filteredList.size();
    }

    @Override
    public Filter getFilter() {

        return new Filter() {
            @Override
            protected FilterResults performFiltering(CharSequence charSequence) {
                String charString = charSequence.toString();
                if (charString .isEmpty()){
                    filteredList = list_items;

                }else {
                    List <list_item>filtering = new ArrayList<>();
                    for (list_item row : list_items){
                        if (row.getHead().toLowerCase().contains(charString.toLowerCase()) || row.getDesc().toLowerCase().contains(charString.toLowerCase())) {
                            filtering.add(row);
                        }
                    }
                    filteredList = filtering;
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = filteredList;
                return filterResults;
            }

            @Override
            protected void publishResults(CharSequence charSequence, FilterResults results) {
                filteredList = (ArrayList<list_item>) results.values;
                notifyDataSetChanged();
            }
        };
    }


    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewHymn;
        private TextView textViewDesc;
        private LinearLayout linearLayout;


        private ViewHolder(View itemView) {
            super(itemView);

            textViewHymn = (TextView)itemView.findViewById(R.id.textViewHymn);
            textViewDesc = (TextView)itemView.findViewById(R.id.textViewDesc);
            linearLayout = (LinearLayout)itemView.findViewById(R.id.linear_layout);
        }




    }


    }



