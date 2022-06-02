package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {

    private List<Mountain> mountains = new ArrayList();

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder((LayoutInflater.from(parent.getContext()).inflate(R.layout.item_mountain, parent, false)));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Mountain mountain = mountains.get(position);

        holder.name.setText(mountain.getName());
        holder.location.setText(mountain.getLocation());
        holder.size.setText(String.valueOf(mountain.getSize()));
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }
    public void setMountains(List<Mountain> mountains) {
        this.mountains = mountains;
    }
}
