package com.backend.npocketbackend.models;

public class FoodComposition {
    Float Calories;
    Float Fat;
    Float Carbs;
    Float Protein;

    public FoodComposition() {
    }

    public FoodComposition(Float calories, Float fat, Float carbs, Float protein) {
        Calories = calories;
        Fat = fat;
        Carbs = carbs;
        Protein = protein;
    }

    public Float getCalories() {
        return Calories;
    }

    public void setCalories(Float calories) {
        Calories = calories;
    }

    public Float getFat() {
        return Fat;
    }

    public void setFat(Float fat) {
        Fat = fat;
    }

    public Float getCarbs() {
        return Carbs;
    }

    public void setCarbs(Float carbs) {
        Carbs = carbs;
    }

    public Float getProtein() {
        return Protein;
    }

    public void setProtein(Float protein) {
        Protein = protein;
    }

    @Override
    public String toString() {
        return "FoodComposition{" +
                "Calories=" + Calories +
                ", Fat=" + Fat +
                ", Carbs=" + Carbs +
                ", Protein=" + Protein +
                '}';
    }
}
