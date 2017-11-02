package com.example.michealcob.ondemandproject;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by michealcob on 11/2/17.
 */

public class adapter extends RecyclerView.Adapter<adapter.ViewHolder> {

    public String[] title = {"Hair Treatment", "Dyeing", "Hair Cut",
            "Hair grooming","Hair Treatment", "Dyeing", "Hair Cut", "Hair grooming",
            "Hair Treatment", "Dyeing", "Hair Cut", "Hair grooming",
            "Hair Treatment", "Dyeing", "Hair Cut", "Hair grooming"};


    public TextView tititit;

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feeds, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        tititit.setText(title[position]);
    }

    @Override
    public int getItemCount() {
        if(null == title) return 0;
        return this.title.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
            tititit = (TextView) itemView.findViewById(R.id.tv_title);
        }
    }
}
