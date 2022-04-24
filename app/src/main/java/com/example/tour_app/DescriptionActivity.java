package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;
import java.util.Objects;

public class DescriptionActivity extends AppCompatActivity {

    TextView textViewOnHeaderText,textViewOnTag,textViewOnDescription;
    ImageView imageViewOnDescriptionView;
    Button mapView ;
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
        mapView = findViewById(R.id.mapView);

        Intent intent = getIntent();
        textViewOnHeaderText.setText(intent.getStringExtra("name"));
        textViewOnTag.setText(intent.getStringExtra("tag"));
        textViewOnDescription.setText(intent.getStringExtra("description"));
        imageViewOnDescriptionView.setImageResource(intent.getIntExtra("image",R.id.imageView1));
        activity.setTitle(intent.getStringExtra("name"));
        String loc = intent.getStringExtra("location");


        mapView.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openMap(loc);
                    }
                }
        );

    }

    private void openMap(String loc) {
        Uri uri = Uri.parse("geo:0,0?q="+loc);
//        String uri = String.format(Locale.ENGLISH, "geo:%f,%f", latitude, longitude);

        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        super.onBackPressed();
        return true;
    }
}