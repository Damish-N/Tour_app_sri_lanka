package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class DescriptionActivity extends AppCompatActivity {

    TextView textViewOnHeaderText,textViewOnTag,textViewOnDescription;
    ImageView imageViewOnDescriptionView;
    final Activity activity = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        textViewOnHeaderText = findViewById(R.id.cardHeaderTextInDescriptionPage);
        textViewOnTag = findViewById(R.id.tagLineInDescriptionPage);
        textViewOnDescription = findViewById(R.id.cardInfoTextInDescriptionPage);
        imageViewOnDescriptionView = findViewById(R.id.imageOnDescriptionPage);
        Intent intent = getIntent();
        textViewOnHeaderText.setText(intent.getStringExtra("name"));
        textViewOnTag.setText(intent.getStringExtra("tag"));
        textViewOnDescription.setText(intent.getStringExtra("description"));
        imageViewOnDescriptionView.setImageResource(intent.getIntExtra("image",R.id.imageView1));
        activity.setTitle(intent.getStringExtra("name"));


    }
}