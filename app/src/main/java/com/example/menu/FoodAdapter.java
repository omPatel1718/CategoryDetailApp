package com.example.menu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Food>{
    public FoodAdapter(Context context, ArrayList<Food> foodArrayList){
        super(context,0,foodArrayList);
    }

    public View getView(int position, View convertView, ViewGroup parent){
        //Get data item for position
        Food myfood = getItem(position);
        //check if reusing existing view
        if(convertView==null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_food_row_layout, parent, false);
        }
        //Look up view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.nameView);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.priceView);
        TextView tvDesc = (TextView) convertView.findViewById(R.id.descriptionView);
        //populate data into template view w/ data object
        tvName.setText(myfood.getName());
        tvPrice.setText("$" + myfood.getPrice());
        tvDesc.setText(myfood.getDesc());
        //return completed view
        return convertView;
    }
}
