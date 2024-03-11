package com.example.horizontalrecyclerview;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {
    ArrayList<Data> data;

    public DataAdapter(ArrayList<Data> data)
    {
        this.data = data;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new DataViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_box, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder holder, int position) {

        holder.imageView.setImageResource(data.get(position).getImage());
        holder.textname.setText(data.get(position).getName());
        holder.textage.setText(String.valueOf(data.get(position).getAge()));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
