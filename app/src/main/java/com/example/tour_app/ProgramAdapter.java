package com.example.tour_app;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;



public class ProgramAdapter extends ArrayAdapter<String> {
    Context context;

    int[] images;
    String[] names;
    String[] descriptions;
    String [] tagLine;
    public ProgramAdapter(Context context, String[] names, String[] descriptions, int[] images, String[] tageLine) {
        super(context,R.layout.single_card_list,R.id.cardHeaderText,names);
//        super(context,R.layout.single_card_list,R.id.cardHeaderText, names,descriptions,images);
        this.context = context;
        this.images = images;
        this.descriptions =descriptions;
        this.names =names;
        this.tagLine = tageLine;
    }

    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        View singleItem = convertView;
        ProgramViewHolder holder = null;
        if(singleItem==null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(
                    Context.LAYOUT_INFLATER_SERVICE
            );
            singleItem = layoutInflater.inflate(R.layout.single_card_list,parent,false);
            holder = new ProgramViewHolder(singleItem);
            singleItem.setTag(holder);
        }else {
            holder = (ProgramViewHolder) singleItem.getTag();
        }
        holder.imageView.setImageResource(images[position]);
        holder.headerText.setText(names[position]);
        holder.descriptionView.setText(tagLine[position]);

        singleItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(getContext(),"You clicked"+ names[position],
//                        Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), DescriptionActivity.class);
                intent.putExtra("name",names[position]);
                intent.putExtra("tag",tagLine[position]);
                intent.putExtra("image",images[position]);
                intent.putExtra("description",descriptions[position]);
                context.startActivity(intent);
            }
        });

        return singleItem;
    }
}
