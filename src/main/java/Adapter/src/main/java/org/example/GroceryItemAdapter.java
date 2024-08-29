package org.example;

public class GroceryItemAdapter implements Item{
    private GroceryItem groceryItem;
    @Override
    public String getItemName() {
        return groceryItem.getName();
    }

    public GroceryItemAdapter(GroceryItem item) {
        this.groceryItem=item;
    }

    @Override
    public String getPrice() {
        return groceryItem.getPrice();
    }

    @Override
    public String getRestaurantName() {
        return groceryItem.getStoreName();
    }
}
