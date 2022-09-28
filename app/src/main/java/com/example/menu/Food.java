package com.example.menu;

import android.os.Parcel;
import android.os.Parcelable;

public class Food implements Parcelable {
    private String name;
    private double price;
    private String desc;
    private int imageResourceID;

    //Code --> Generate
    public Food(String name, double price, String desc, int imageResourceID) {
        this.name = name;
        this.price = price;
        this.desc = desc;
        this.imageResourceID = imageResourceID;
    }

    // A default constructor is ABSOLUTELY REQUIRED for the Parcelable interface to work
    // even if you never use it, *make it*
    public Food() {
        name = "";
        price = 0;
        desc = "";
        imageResourceID = 0;
    }


    // this code is needed for the Food class to work with Parcelable
    // stays the same for all classes using Parcelable besides class name (Food)
    public static final Parcelable.Creator<Food> CREATOR = new
            Parcelable.Creator<Food>() {

                @Override
                public Food createFromParcel(Parcel parcel) {
                    return new Food(parcel);
                }

                @Override
                public Food[] newArray(int size) {
                    return new Food[0];
                }
            };

    /** This is a "constructor" of sorts that is needed with the Parcelable interface to
     * tell the intent how to create a Food object when it is received from the intent
     * basically it is setting each instance variable as a String or Int
     * if the instance variables were objects themselves you would need to do more complex * code.  We need to read in the String, double, and int data.
     * @param parcel    the parcel that is received from the intent
     */
    //important that all vars here are in order in every constructor
    public Food(Parcel parcel) {
        name = parcel.readString();
        price = parcel.readDouble();
        desc = parcel.readString();
        imageResourceID = parcel.readInt();
    }

    /**
     * This is what is used when we send the Food object through an intent
     * It is also a method that is part of the Parcelable interface and is needed
     * to set up the object that is being sent.  Then, when it is received, the
     * other Food constructor that accepts a Parcel reference can "unpack it"
     */
    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeDouble(price);
        dest.writeString(desc);
        dest.writeInt(imageResourceID);
    }

    /**
     * This method is required for the Parceable interface.  As of now, this method * is in the default state and doesn't really do anything.
     *
     * If your Parcelable class will have child classes, you'll need to
     * take some extra care with the describeContents() method. This would
     * let you identify the specific child class that should be created by
     * the Parcelable.Creator. You can read more about how this works on
     *  Stack Overflow with this link.
     *           https://stackoverflow.com/questions/4778834/purpose-of-describecontents-of-parcelable-interface
     * @return
     * necessary if your class has other objects as instance vars (maybe)
     */

    @Override
    public int describeContents() {
        return 0;
    }


    public static final Food[] mySnacks = {
            new Food("Pretzel", 4.99, "it's in the top 3 salt delivery mechanisms", R.drawable.pretzel),
            new Food("Fries", 1.50, "comes with mayo and ketchup", R.drawable.fries),
            new Food("Popcorn", 3.99, "buttery", R.drawable.popcorn2)
    };

    public static final Food[] myApps = {
            new Food("Nachos", 3.99, "has cheese, salsa, jalapenos, and sour cream", R.drawable.dorito),
            new Food("Bread sticks", 1.99, "it's not unlimited", R.drawable.breadsticks),
            new Food("Salad", 2.99, "for if you want something healthy",R.drawable.leaf),
    };

    public static final Food[] myDeserts = {
            new Food("Cookies", 1.99, "those cookies that are dry and toothache sweet", R.drawable.sugar_cookies),
            new Food("Cake", 2.99, "fruit, carrot, chocolate, vanilla, egg, and more", R.drawable.cake),
            new Food("Ice cream", 1.99, "flavors: ice, cream, spiderman, rocky road", R.drawable.ice_cream)
    };


    //overrides default print
    //don't use Generate
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }

    public void setImageResourceID(int imageResourceID) {
        this.imageResourceID = imageResourceID;
    }
}
