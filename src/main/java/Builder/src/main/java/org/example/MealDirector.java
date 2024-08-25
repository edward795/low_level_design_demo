package org.example;

public class MealDirector {
    private MealBuilder mealBuilder;
    public MealDirector(MealBuilder mealBuilder){
        this.mealBuilder=mealBuilder;
    }

    public Meal prepareMeal(){
        mealBuilder.addBiriyani();
        mealBuilder.addBread();
        mealBuilder.addCurry();
        mealBuilder.addColdDrink();
        return mealBuilder.build();
    }
}
