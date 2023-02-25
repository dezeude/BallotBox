package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static String extraStuff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mapButtonOnClick(View view){
        Intent intent = new Intent(this, MapViewActivity.class);
        intent.putExtra(extraStuff, 1);
        startActivity(intent);
    }
}