package com.example.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        try {
            // This gets the particular Detailed object we are displaying
            // In this case, it is a Food object.
            Food myFood = intent.getParcelableExtra(CategoryActivity.DETAIL_CHOICE);
            Log.i("denna", myFood.getName() + " " + myFood.getDesc() + " " + myFood.getPrice());
            // This page will display the specific Detailed data for what your app is showing.
            // Get references to the xml views for name, price, desc, and photo

            // Finish this code to match your xml file.  These names are what I used.
            TextView name = findViewById(R.id.nameView);
            TextView price = findViewById(R.id.priceView);
            TextView desc = findViewById(R.id.descriptionView);
            ImageView photo = findViewById(R.id.imageView);

            // set values on the screen based on the object that was passed to this Detail activity

            name.setText(myFood.getName());
            price.setText("$"+myFood.getPrice());
            desc.setText(myFood.getDesc());

            if (myFood.getImageResourceID() == 0) {
                // set a default pic or decide what to do in this case.
            }
            else {
                photo.setImageResource(myFood.getImageResourceID());
            }
        }
        catch (Exception e) {
            Log.i("Denna", "Food app not working!");
        }
    }
}
