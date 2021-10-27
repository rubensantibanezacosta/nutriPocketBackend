package com.backend.npocketbackend.utils;


import com.backend.npocketbackend.models.Food;
import com.backend.npocketbackend.models.FoodComposition;
import com.fatsecret.platform.model.CompactFood;
import org.springframework.stereotype.Service;

@Service
public class CompactFoodToFood {


    public static Food convertToFood(CompactFood compactFood) {
        Food food = new Food();
        try {
            food.setName(compactFood.getName());
            food.setId(0);
            FoodComposition composition = new FoodComposition();
            //Desconstruct description string to construct composition
            String[] properties = compactFood.getDescription().replace("g", "").replace("-", "|").replace("Per", "").replace(":", "").replace("kcal", "").split("\\|");
            properties[0] = properties[0].replace(" ", "");
            for (int i = 1; i < properties.length; i++) {
                properties[i] = properties[i].replace(" ", "|").split("\\|")[2].replace(" ", "");
            }

            if (properties[0].length() < 4) {

                composition.setCalories(Float.parseFloat(properties[1]) / Float.parseFloat(properties[0]));
                composition.setFat(Float.parseFloat(properties[2]) / Float.parseFloat(properties[0]));
                composition.setCarbs(Float.parseFloat(properties[3]) / Float.parseFloat(properties[0]));
                composition.setProtein(Float.parseFloat(properties[4]) / Float.parseFloat(properties[0]));
            }
            food.setComposition(composition);

            return food;
        } catch (Exception e) {
            return null;
        }

    }
}
