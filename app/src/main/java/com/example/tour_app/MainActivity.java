package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    ImageView imageViewHills, imageViewArts, imageViewSea, imageViewNature;

    RelativeLayout relativeLayout1, relativeLayout2, relativeLayout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Objects.requireNonNull(getSupportActionBar()).hide();
        imageViewHills = findViewById(R.id.imageView1);
        imageViewArts = findViewById(R.id.imageView2);
        imageViewSea = findViewById(R.id.imageView3);
        imageViewNature = findViewById(R.id.imageView4);

        relativeLayout1 = findViewById(R.id.sinharaja);
        relativeLayout3 = findViewById(R.id.fort);
        relativeLayout2 = findViewById(R.id.hortantPlace);

        //route to the hills
        imageViewHills.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Hills.class);
            startActivity(intent);
            finish();
        });

        //routes to arts
        imageViewArts.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Arts.class);
            startActivity(intent);
            finish();
        });

        //routes to seas
        imageViewSea.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Beaches.class);
            startActivity(intent);
            finish();
        });

        //routes to nature
        imageViewNature.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, Forests.class);
            startActivity(intent);
            finish();
        });

        relativeLayout1.setOnClickListener(v -> {
            Intent intent = new Intent(this, PopularListDescription.class);
            intent.putExtra("name", "Sinharaja Forest Reserve");
            intent.putExtra("tag", "You can see various types of endemic species and plants, birds, lizards, snails, snakes, butterflies");
            intent.putExtra("image", R.drawable.forestes1);
            intent.putExtra("description", "Encompassing the last extensive patch of primary lowland rainforest in Sri Lanka, Sinharaja Forest Reserve is situated in the south-west lowland wet zone of Sri Lanka.  Covering an area of 8,864 ha and ranging from an altitude of 300 – 1,170 meters, it consists of 6,092 ha of Forest Reserve and 2,772 ha of Proposed Forest Reserve. This narrow strip of undulating terrain encompasses a series of ridges and valleys that are crisscrossed by an intricate network of streams. Draining to both the south and north, this detailed matrix of waterways flow into the Gin River on the southern boundary of the property and Kalu River via the Napola Dola, Koskulana Ganga and Kudawa Ganga on its northern boundary. Annual rainfall over the last 60 years has ranged from 3614 - 5006 mm with most of the precipitation during the south-west monsoon (May-July) and the north-east monsoon (November- January).\\n\" +\n" +
                    "                    \"\\n\" +\n" +
                    "                    \"Sri Lanka is home to 830 endemic species, of which 217 trees and woody climbers are found in the low land wet zone. Of these, 139 (64%) have been recorded in the reserve including 16 rare species. Faunal endemism is particularly high for birds with 19 (95%) of 20 species recorded in the property being endemic to Sri Lanka. Endemism among mammals and butterflies is also greater than 50%. A number of threatened, endangered and rare species occur within the reserve including: leopard (Panthera pardus), Indian elephant (Elephas maxiumus), endemic purple-faced Langur (Presbytis senex), Sri Lanka wood pigeon (Columba torringtoni), green-billed Coucal (Centropus chlororrhynchus), Sri Lanka white-headed starling (Sturnus senex), Sri Lanka blue magpie (Cissa ornate), ashy-headed babbler (Garrulax cinereifrons) and Sri Lanka broad-billed roller (Eurystomus orientalis irisi). ");
            startActivity(intent);
            finish();
        });
        relativeLayout2.setOnClickListener(v -> {
            Intent intent = new Intent(this, PopularListDescription.class);
            intent.putExtra("name", "Hortant place");
            intent.putExtra("tag", "Lush nature preserve on a plateau");
            intent.putExtra("image", R.drawable.hortant_place);
            intent.putExtra("description", "Horton Plains, its surroundings, forests and the adjoining Peak Wilderness constitute Sri Lanka’s most important catchment area of almost all major rivers. The plains are also of outstanding scenic beauty and conservation importance, containing most of the habitats and endemic plants and animals representative of the country’s wet and Montane zones. The western slopes support the most extensive area of Montane cloud forest surviving in the island. Horton Plains is not merely a destination for nature tourists. Since the rich biodiversity of Horton Plains is still grossly underexplored, it affords invaluable opportunities to those engaged on educational and research activities. Protecting Horton Plains is a call of duty for all Sri Lankans.");
            startActivity(intent);
            finish();
        });
        relativeLayout3.setOnClickListener(v -> {
            Intent intent = new Intent(this, PopularListDescription.class);
            intent.putExtra("name", "Galle Fort");
            intent.putExtra("tag", "Historic fortress with shops and a museum");
            intent.putExtra("image", R.drawable.fort);
            intent.putExtra("description", "The Galle Fort, or Dutch Fort as it is also known, is a fortification first built by the Portuguese on the Southwestern coast of Sri Lanka. The initial fortifications, which were built in the late 16th century, were quite basic. However, the fort underwent extensive modifications in the 17th century by the Dutch, making it one of the most important archeological, architectural and historic monuments to illustrate the European influence in South East Asia between the 16th and 19th centuries. According to a statement by UNESCO, the site was recognized as a World Heritage Site for its unique exposition of an urban ensemble which illustrates the interaction of European architecture and South Asian traditions from the 16th to the 19th centuries which is criterion number four for such recognition.");
            startActivity(intent);
            finish();
        });


    }


}