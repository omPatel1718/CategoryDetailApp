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
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.category_row, parent, false);
        }
        //Look up view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.foodName);
        TextView tvPrice = (TextView) convertView.findViewById(R.id.price);
        TextView tvDesc = (TextView) convertView.findViewById(R.id.description);
        //populate data into template view w/ data object
        tvName.setText(myfood.getName());

        String temp = "" + myfood.getPrice();
        tvPrice.setText("$" + temp);
        tvDesc.setText(myfood.getDesc());
        //return completed view
        return convertView;
    }
}
