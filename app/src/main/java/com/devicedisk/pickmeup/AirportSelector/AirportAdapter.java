package com.devicedisk.pickmeup.AirportSelector;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class AirportAdapter extends RecyclerView.Adapter<AirportAdapter.AirportViewHolder> {

    private  String[] data;
    public AirportAdapter(String[] data)
    {

        this.data = data;


    }


    @NonNull
    @Override
    public AirportViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AirportViewHolder airportViewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class AirportViewHolder extends RecyclerView.ViewHolder{
        public AirportViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
