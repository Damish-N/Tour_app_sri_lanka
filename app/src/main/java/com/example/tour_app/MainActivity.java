package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewHills,imageViewArts,imageViewSea,imageViewNature;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Objects.requireNonNull(getSupportActionBar()).hide();
        imageViewHills = findViewById(R.id.imageView1);
        imageViewArts = findViewById(R.id.imageView2);
        imageViewSea = findViewById(R.id.imageView3);
        imageViewNature = findViewById(R.id.imageView4);

        //route to the hills
        imageViewHills.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity.this, Hills.class);
            startActivity(intent);
            finish();
        });


    }



}