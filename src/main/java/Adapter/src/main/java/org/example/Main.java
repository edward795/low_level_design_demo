package org.example;

public class Main {
    SwiggyStore swiggyStore = new SwiggyStore();
   swiggyStore.addItems(new

    FoodItem());
   swiggyStore.addItems(new

    FoodItem());

    //Adapter grocery which was incomptabale with food
    swiggyStore.addItems(new
    GroceryItemAdapter(new GroceryItemAdapter(new GroceryProduct())));
}