package org.example;

public class Main {
    public static void main(String[] args) {

        Burger burger=new Burger.BurgerBuilder()
                .mayonese(true)
                .egg(false)
                .onion(false)
                .extraCheese(true)
                .size("LARGE")
                .build();
        Meal meal=new MealDirector(new VegMealBuilder()).prepareMeal();
    }
}