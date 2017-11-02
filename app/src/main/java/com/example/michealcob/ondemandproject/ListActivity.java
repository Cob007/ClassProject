package com.example.michealcob.ondemandproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
    }

    public void LoadSave(View view){
        startActivity(new Intent(ListActivity.this, OrderSave.class));
    }
}
