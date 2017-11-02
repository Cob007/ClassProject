package com.example.michealcob.ondemandproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class MainActivity extends AppCompatActivity implements RecyclerViewOnClickListener.OnItemClickListener{

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new adapter();
        GridLayoutManager linearLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerViewOnClickListener(this, this));
    }

    @Override
    public void onItemClick(View view, int position) {
        Intent intent = new Intent(this, ListActivity.class);
        startActivity(intent);
    }

    @Override
    public void onItemLongClick(View view, int position) {

    }
}
