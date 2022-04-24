package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Objects;

public class Hills extends AppCompatActivity {

    ListView listViewHill;
    String[] hillNames = {"Adam’s Peak (Sri Pada Mountain)","Mountain Range of Knuckles",
            "Hantana Mountains","Pidurutalagala Mountain","Ritigala"};
    String[] description = {"The most famous physical feature of Ceylon is Adam’s Peak, which is situated in the Ratnapura district. It is on the edge of the central massif but its surrounding group of mountains called the Wilderness of the Peak is so extensive in comparison to the bulk of the other mountain groups that it appears to form a nucleus of its own, separate from the others. It is about 7500 ft high and, though it is the second-highest peak in the land, its position in relation to the topography is so dominant that it stands out above all others.",
    "The Knuckles range, which lies in the Kandy and Matale Administrative Districts, was originally known as the Dumbara Kanduwetiya (misty mountain range). Its present name, given to it by British surveyors, is derived from the shape of its main massif, which resembles the knuckles on a fist.\n" +
            "\n" +
            "Knuckels misty mountain range with rich bio-diversity rises 1863 meters above the Dumbara valley, starting point for many rivers in the island. The mountain range from north of Kandy District expands to Hunnasgiriya, Rangala, Madugoda, Elkaduwa, Matale, Nalanda, Wagomuwa, and Dimbulagala Eco locations. There are 35 peaks rising to more than 3000 feet (915 m) in the nuckles range",
    "Famous among local climbers hantana can be seen from Kandy dressed in mist. A great place to go when you are in Kandy.\n" +
            "\n" +
            "Hantana Mountains – Kandy Sri Lanka",
            "Sri Lanka’s highest peak, also known as Mount Pedro, rises 2524m (8281ft) above sea level, immediately behind the town. Unfortunately, the path to the summit, which is the site of Sri Lanka's main television transmitter, is closed to visitors for security reasons. For a view of the summit and a superb panorama of the surrounding hills and plantations, you can walk to the top of the picturesquely named single Tree Mountain, south of town off the Badulla road, in about 90 minutes.",
            "A beautifully paved footpath, several elevated platforms, ruins of an old hospital and remains of a terraced pond are what is unearthed at this 180 BC Buddhist monastery at the foothill of 600m high Ritigala Rock. Dating back to around 350 B.C is one of the oldest historical places mentioned in the ancient chronicles. (about 50km southeast of Anuradhapura)",
            "1358Meters hight, Situated in Rakwana mountain range Gongala is a great place for an eco-experience of Sinharaja. From the west side, you can see the Sinharaja Rain Forest Mountains and Canopy. The Nothern and Eastern side will show you Rakwana and Balangoda as well as Udawalawe forest in the distance. The Southside view if most spectacular ranging the views to Matara the sea town of south. The Drive to the mountain top is breathtaking.\n" +
                    "Gongala – Rathnapura Sri Lanka"
    };
    String[] tageLine = {"The most famous physical feature of Ceylon is Adam’s Peak","isty mountain range with rich bio-diversity rises 1863 meters above"
            ,"Hantana Mountains – Kandy Sri Lanka","Sri Lanka’s highest peak, also known as Mount Pedro","Gongala is a great place for an eco-experience of Sinharaja"};

    int[] hillImages =  {R.drawable.hill1,R.drawable.hill2,R.drawable.hill3,R.drawable.hill4,R.drawable.hill5};

    String [] locations ={"Sri Pada / Adam's Peak","Knuckles","Hanthana Hiking Road","Pidurutalagala Mountain","Ritigala"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hills);
        listViewHill = findViewById(R.id.hillList);
        ProgramAdapter programAdpter = new ProgramAdapter(this,hillNames,description,hillImages,tageLine,locations);
        listViewHill.setAdapter(programAdpter);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }


}