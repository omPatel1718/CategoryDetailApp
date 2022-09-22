package com.example.menu;

public class Food {
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

    public static final Food[] mySnacks = {
            //new Food("Nachos", 3.99, "snak", ),
            new Food("Pretzel", 4.99, "snak", R.drawable.pretzel),
            new Food("Fries", 1.50, "snak", R.drawable.fries)
    };

    public static final Food[] myDrinks = {
            //new Food("Water", 0.99, "Water", ),
            //new Food("Juice", 1.99, "Orange, Apple, Lemon, Pineapple", )
            //new Food("Soda", 1.99, "insert list of brands here"
    };

    public static final Food[] myEntrees = {
            //new Food("Sand", 0.99, "Water", ),
            //new Food("Juice", 1.99, "Orange, Apple, Lemon, Pineapple", )
            //new Food("Soda", 1.99, "insert list of brands here"
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
