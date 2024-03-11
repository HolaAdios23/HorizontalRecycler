package com.example.horizontalrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.HorizontalScrollView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView horizontalview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        horizontalview = findViewById(R.id.horizontal_recyclerView);

        ArrayList<Data> data = new ArrayList<>();
        data.add(new Data("John", 38, R.drawable.a));
        data.add(new Data("Jack", 40, R.drawable.b));
        data.add(new Data("Jason", 38, R.drawable.c));
        data.add(new Data("Jimmy", 55, R.drawable.d));
        data.add(new Data("James", 67, R.drawable.e));

        DataAdapter dataAdapter = new DataAdapter(data);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, true);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        horizontalview.setAdapter(dataAdapter);
        horizontalview.setLayoutManager(layoutManager);

    }
}