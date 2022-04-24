package com.example.tour_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.Objects;

public class Forests extends AppCompatActivity {

    ListView forestList;
    String[] forestPlaces = {"Sinharaja Forest Reserve", "Riverstone Gap", "Makandawa Forest Reserve", "Kanneliya Rain Forest Reserve"};
    String[] description = {
            "Encompassing the last extensive patch of primary lowland rainforest in Sri Lanka, Sinharaja Forest Reserve is situated in the south-west lowland wet zone of Sri Lanka.  Covering an area of 8,864 ha and ranging from an altitude of 300 – 1,170 meters, it consists of 6,092 ha of Forest Reserve and 2,772 ha of Proposed Forest Reserve. This narrow strip of undulating terrain encompasses a series of ridges and valleys that are crisscrossed by an intricate network of streams. Draining to both the south and north, this detailed matrix of waterways flow into the Gin River on the southern boundary of the property and Kalu River via the Napola Dola, Koskulana Ganga and Kudawa Ganga on its northern boundary. Annual rainfall over the last 60 years has ranged from 3614 - 5006 mm with most of the precipitation during the south-west monsoon (May-July) and the north-east monsoon (November- January).\n" +
                    "\n" +
                    "Sri Lanka is home to 830 endemic species, of which 217 trees and woody climbers are found in the low land wet zone. Of these, 139 (64%) have been recorded in the reserve including 16 rare species. Faunal endemism is particularly high for birds with 19 (95%) of 20 species recorded in the property being endemic to Sri Lanka. Endemism among mammals and butterflies is also greater than 50%. A number of threatened, endangered and rare species occur within the reserve including: leopard (Panthera pardus), Indian elephant (Elephas maxiumus), endemic purple-faced Langur (Presbytis senex), Sri Lanka wood pigeon (Columba torringtoni), green-billed Coucal (Centropus chlororrhynchus), Sri Lanka white-headed starling (Sturnus senex), Sri Lanka blue magpie (Cissa ornate), ashy-headed babbler (Garrulax cinereifrons) and Sri Lanka broad-billed roller (Eurystomus orientalis irisi). ",
            "Located approximately 30 km from the Matale town, when travelling on Matale – Girandurukotte road, rather windy with quite a few hairpins turns but in good condition, offers great views all around with a mini worlds end, lot less travelled by main stream tourists. Climatic conditions here are very similar to Horton plains with the addition of having two great waterfalls “Sera Ella” and “Bambarakiri Ella”, both of which are a site for sore eyes, don’t forget to relax on the rock seats of “Sera Ella” relishing the cold misty spray of water on your face and Thelgamu Oya offers a great site for a dip in crystal clear but chilly water.\n" +
                    "\n" +
                    "Travelling further upstream on this very scenic stream will no doubt will make you feel refreshed and rejuvenated. We recommend that you plan a trekking trip (02.5km) to the mist clad Riverston peak via pittawala pathana, as it offers some of the greatest views of the central hills across the mini worlds end which ends in a sheer drop of 300 meters offering a great vista especially of the “Knuckles range”, and the thelgamu valley below with its terraced paddy field method unique to the central hills of Sri Lanka.",
            "This secondary lowland rainforest has several interesting geographical features; such as crystal clear natural rock pools, waterfalls, wonderfully challenging trails that meander through the thick tropical rainforest, and of course the Kelani River running right through the jungle. As such it is a great place to go hiking, whitewater rafting, birdwatching or butterfly watching. There are also a number of adventure sports that you can engage in in Kithulgala.\n" +
                    "\n" +
                    "For those interested in the flora and fauna; there are a number of rare species to be observed here. These include fish such as the Asoka Barb, Black Ruby Barb, Black-lined Barb and the Stone Sucker; as well as 54 rare bird species such as the endemic Sri Lankan Orange-billed Babbler, Green billed Coucal, the Chestnut-backed Owlet, Yellow-fronted Barbet, Ceylon jungle & spur fowl, Layard’s Parakeet, Ceylon Lorikeet, Common Hill Mynah, the Black-rumped Flameback, Sri Lankan Crested Drongo, Ceylon Grey Hornbill, and the Sri Lankan Brown-capped Babbler; and several species of endemic butterflies, dragonflies and reptiles. The most commonly seen mammal is the Grizzled-tailed giant squirrel, while the Red Slender Loris is more rarely seen.\n" +
                    "\n" +
                    "The Makandawa forest receives rainfall mainly during the two monsoon seasons. During these seasons the Kelani River runs wild and wide making it impossible to cross without a boat; and a traditional dugout canoe with an outrigger is commonly used by the locals for this task.",
            "The Kanneliya Forest reserve has large number of endemic flora and fauna; with 17 percent of lowland endemic floral species confined to this forest area, and 41 species of endemic fauna living there. Of the 319 woody plants recorded in the KDN forest reserve, about 52 per cent are endemic. The vegetation is representative of the Sri Lankan lowland rainforests; with the floral communities dominated by Shorea, Dipterocarpus, andMesua plants, which is common in the emergent layer. The forest also harbours numerous medicinal plants and rare plants within the forest; including  yellow vine (Concinium fenestratum), Salacia reticulata, heart-leaved moonseed (Tinospora cordifolia), coarse tassel fern (Lycopodium Squarrosum), and coarse tassel fern (Lycopodium phlegmaria). 27 percent of the floral species within the forest are listed as vulnerable, and 45 percent are in the rare plants category.\n" +
                    "\n" +
                    "Kanneliya also has a total of over 220 known species of fauna; including 86 species of mammals, 36 species of snakes, and several species of avian life and fish. Amongst the bird species here; 26 birds are endemic with 20 of them only seen within the KDN forest complex. Some of these are the Sri Lankan spur fowl, Sri Lankan jungle fowl, Sri Lankan grey hornbill, red-faced Malkoha, orange-billed babbler and the Sri Lankan blue magpie. The Green-billed Coucal, Sri Lankan blue magpie, ashy-headed laughing thrush and the white-faced starling are bird species that are also listed as endangered. Twenty percent of Sri Lanka’s endemic freshwater fishes inhabit in the waters of Gin River and Nilwala River; while 17 endemic snakes are amongst the Kanneliya Rainforest’s herpetofauna.  A total of 23 species of lizards were recorded within the KDN forest reserve."
    };
    String[] tageLine = {
            "You can see various types of endemic species and plants, birds, lizards, snails, snakes, butterflies",
            "To get the full experience u need to climb the Riverstone SLT Tower mountain. This is where everyone goes to feel",
            "I took the boat across the river three times and the followed clear paths into the forest .",
            "It's still a great place for an early morning bird-watching expedition. Bring your own food and water"
    };
    int[] images = {R.drawable.forestes1, R.drawable.forests4, R.drawable.forestes3,
    R.drawable.foresets2};
    String location[]= {"Sinharaja Forest Reserve, Deniyaya","Pitawala Pathana, Riverston","Makandawa Conservation Center (Makandawa Forest), Kitulgala",
            "5CM8+5J3 Kanneliya-Dediyagala-Nakiyadeniya, Pitabeddara"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forests);

        forestList = findViewById(R.id.forestList);
        ProgramAdapter programAdapter = new ProgramAdapter(this,forestPlaces,description,images,tageLine,location);
        forestList.setAdapter(programAdapter);
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        Intent myIntent = new Intent(getApplicationContext(), MainActivity.class);
        startActivityForResult(myIntent, 0);
        return true;
    }
}