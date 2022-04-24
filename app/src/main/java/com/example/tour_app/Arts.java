package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Objects;

public class Arts extends AppCompatActivity {

    ListView lisViewArts;
    String[] artsPlaces = {"Masks","Handloom","Lacquer work"};
    String[] description ={"Sri Lanka’s traditional art and culture scene brims with uniqueness. Representing it in all authenticity for decades is Ambalangoda Mask Factory & Museum. Enter this haven of ancient culture and you’ll find intriguing masks staring at you.\n" +
            "\n" +
            "Along with two entire collections belonging to the Sanni Yakuma ritual and Kolam Dance, primitive tools used to carve these marks are also displayed here. The museum has a small library and a mask workshop as well. The mask library is one of its kind in Sri Lanka. It has anthropological records of mask-making and the history of traditional performances that use masks.",
    "Today, Sri Lankan handloom industry is basically a cottage industry, with few large manufacturers leading the way. An industry governed largely by women, the Sri Lankan heritage and traditional weaving patterns are kept alive in collaboration with the National Handloom Center of Sri Lanka. Most of Sri Lankan handlooms are made of cotton and silk threads and many are presented as sarees, shawls, sarongs as well as household linen, upholstery, tapestry, and curtain fabrics. Exported around the world and available under local and global brands traditional handlooms of Sri Lanka continue to add colour to many living spaces around the country.",
    "These skillfully made traditional handicrafts are a very popular choice amongst tourists and seekers of tokens depicting Sri Lankan culture. Originating in central Sri Lanka, the knowledge of lacquer making has spread throughout the island over the centuries. \n" +
            "\n" +
            "The base product for the traditional lacquerware is a wax derived from a species of insects, which is imported from India. Whilst the age-old methods are used by some, new tools and procedures introduced with time are preferred by the others in the making of these complex and exquisite designs."};
    String[] tageLine ={"Sri Lanka’s traditional art and culture scene brims with uniqueness",
                        "Sri Lanka has a historical connection to handlooms and the loom had been portrayed generously",
                        "These skillfully made traditional handicrafts are a very popular choice"};
    int [] images ={R.drawable.art1,R.drawable.art2,R.drawable.art3};

    String [] locations ={"63R2+G74, Main St, Ambalangoda","No.825, Sri Jayawardenepura Kotte","Ape Gama Parliament Rd, Sri Jayawardenepura Kotte, 10120"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);
        lisViewArts = findViewById(R.id.artList);
        ProgramAdapter programAdpter = new ProgramAdapter(this,artsPlaces,description,images,tageLine,locations);
        lisViewArts.setAdapter(programAdpter);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}