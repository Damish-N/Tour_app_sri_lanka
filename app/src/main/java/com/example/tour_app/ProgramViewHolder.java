package com.example.tour_app;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {
    ImageView imageView;
    TextView headerText;
    TextView descriptionView;
    ProgramViewHolder(View v){
        imageView = v.findViewById(R.id.imageViewCard);
        headerText = v.findViewById(R.id.cardHeaderText);
        descriptionView=v.findViewById(R.id.cardInfoText);
    }

}
