package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Objects;

public class Beaches extends AppCompatActivity {

    ListView beachesList;
    String[] beachesNames = {"Nilaveli","Kalkudah","Arugam Bay","Mirissa","Unawatuna","Uppuveli","Negombo","Tangalle Beach"};
    String[] description ={"Nilaveli Beach is a broad, sandy beach, lined with palm trees and dotted with fishermen's boats. Located on the northeast part of Sri Lanka, it's a 30-minute drive from the city of Trincomalee. This tiny island has calm beaches with gentle surf due to its own small reef. Although the beach at Nilaveli is large, it is popular with both locals and tourists. There are lifeguards on duty and many little restaurants along the beach, most specializing in seafood.\n" +
            "\n" +
            "The Trincomalee area is also good for sightseeing, as it's a center of Tamil culture. Tamil is the name of the language spoken in Sri Lanka and the ethnic group to which the majority of its residents belong.",
            "This mile-long beach on Pasikuda Bay is perfect for swimming and wading. The surf is gentle, protected by a reef, unlike many beaches in Sri Lanka with rough surf. The water is also shallow, allowing you to walk out into the ocean for hundreds of yards. The sand is bright white and soft, with fine grains, and the beach is lined with coconut trees. This area is just starting to be discovered for luxury resort development, so there is plenty of untouched beach to explore.",
            "Arugam Bay is dramatically beautiful, with bright white sand and deep blue water gradually becoming green the closer you get to the shore. With that beauty comes some of the best surf breaks in Sri Lanka, and the beach is known as an international surf destination. This reputation brings many visitors but also means the area has a good tourist infrastructure and is easy to access. The curving beach feels a bit like a Hawaiian beach - the area near the water slopes down, and there's a dry, sandy section, then rougher areas with shrubs and a tree line.\n" +
                    "\n" +
                    "Right on Arugam Bay, The Spice Trail is a cool, little luxury resort with individual villa accommodations. Each has its own small outdoor garden area, perfect for relaxing on a lounge chair. Attractions nearby include ancient temples and Kumana National Park, known for the many species of birds that live in or migrate through the area.\n" +
                    "\n",
            "Mirissa is the largest fishing port on the south coast and sits right on the southern tip of the island. Its beauty and relative proximity to Colombo (the capital city) mean it's not hard to access. It's about a two-hour drive from the capital's airport. The small beach town and its large beach are beautiful, backed by a dense grove of palm trees. The town is on a little hill that rises up behind the beach.\n" +
                    "\n" +
                    "Mirissa Beach is arrow-shaped, with the arrow tip sticking out into the sea. This natural jetty also makes the surf calm and good for swimming. The beaches are bright white, with soft, fine sand, and the water is crystal clear. It's light green where the bottom is sandy and dark blue where there are rocks or reef. Mirissa is also a great place if you want to do some whale watching, best done in February and March",
                    "Unawatuna and its beach are near the colonial town of Galle, which is a great city for sightseeing. Sri Lanka was formerly a colony of both Portugal and Holland (at different times), and this was the country's main city during that time. About five kilometers outside Galle, Unawatuna offers another little bit of beach paradise.\n" +
                            "\n" +
                            "The area, also a big destination for ecotourism, has a large coral reef offshore. The beach is large and curving but can be crowded as it's considered one of the country's best beach resorts. CoCo Bay Unawatuna is a well-appointed beachfront resort with its own little private section of the beach with lounge chairs.",
            "Located on the island's less developed east coast, Uppuveli offers a true remote, unspoiled beach experience. This is a real, rural beach, so your day at the beach just might be shared with a local cow. If you arrive early, you can watch (or help) the fisherman haul in their nets. The sand is golden, and the sea here is light-blue due to the sun's reflection off the sandy bottom. It's about five kilometers from Trincomalee.\n" +
                    "\n" +
                    "The Amaranthe Bay Resort in Trincomalee has an enormous infinity pool and offers a lot more than its budget price would get you in other countries. It's across the lagoon from the main beach, but has a tiny man-made one of its own.",
            "Only an hour from Colombo, not far from the airport, Negombo has a cool little village atmosphere. Catering to tourists, the beach has a shoreline dotted with restaurants and tiny shops selling handicrafts. There are also bands and musicians playing along the beach, adding to the lively vibe. The beach is wide and flat, with beach chair and umbrella rentals available from enterprising locals. You can find every kind of water sport imaginable here, both rentals and lessons. Be careful; the sea here can be rough for swimming and has strong currents.\n" +
                    "\n" +
                    "Waterland is an excellent resort near the beach that offers private villas with private pools and a dining barge where guests can enjoy a 360-degree view of the water.",
                    "Tangalle is on the southern coast, and its colors make for great Instagram photos. The light sand is in sharp contrast with the dark blue water, both set against deep green foliage that lines the beach. Like many other beaches in Sri Lanka, the beach edge is lined with a dense grove of trees. The top part of the beach is powdery, light gold-colored sand, with a steep incline near the waterline.\n" +
                            "\n" +
                            "The Anantara Peace Haven Tangalle Resort is a beachfront luxury property with villa accommodations. Near Tangalle, there's a new resort area close to the country's huge, recently opened seaport. Hambantota is being redeveloped as a new tourist destination"
    };
    String[] tageLine ={"Nilaveli Beach is a broad, sandy beach, lined with palm trees and dotted with fishermen's boats.",
            "This mile-long beach on Pasikuda Bay is perfect for swimming and wading",
            "Arugam Bay is dramatically beautiful, with bright white sand and deep blue water",
            "Mirissa is the largest fishing port on the south coast ",
            "Unawatuna and its beach are near the colonial town of Galle,",
    "Located on the island's less developed east coast, Uppuveli offers a true remote, unspoiled beach experience",
    "Only an hour from Colombo, not far from the airport, Negombo has a cool little village atmosphere.",
            "Tangalle is on the southern coast, and its colors make for great Instagram photos."
    };
    int [] images ={R.drawable.beaches1,R.drawable.beaches2,R.drawable.beaches3,R.drawable.beaches4
    ,R.drawable.beaches5,R.drawable.beaches6,R.drawable.beaches7,R.drawable.beaches8};
    String [] locations ={"Nilaveli Beach","Kalkudah Beach, Kalkudah","Arugam Bay Beach",
            "Mirissa Beach, Mirissa","Unawatuna Beach, Unawatuna","Uppuveli Beach, Uppuveli",
            "Negombo Beach, Negombo","Tangalle Beach, Tangalle"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beaches);
        beachesList = findViewById(R.id.beachesList);
        ProgramAdapter programAdapter = new ProgramAdapter(this,beachesNames,description,images,tageLine,locations);
        beachesList.setAdapter(programAdapter);

    }

    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}