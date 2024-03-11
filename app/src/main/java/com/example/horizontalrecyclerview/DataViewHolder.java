package com.example.horizontalrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DataViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView textname, textage;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.image_view);
        textname = itemView.findViewById(R.id.text_name);
        textage = itemView.findViewById(R.id.text_age);

    }
}
