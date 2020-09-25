package com.example.tourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class RestarauntActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.items_list);

        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new RestarauntFragment())
                .commit();
    }
}