package com.backend.npocketbackend.services;

import com.backend.npocketbackend.models.Food;
import com.backend.npocketbackend.utils.CompactFoodToFood;
import com.fatsecret.platform.model.CompactFood;
import com.fatsecret.platform.services.FatsecretService;
import com.fatsecret.platform.services.Response;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlimentosImpl implements IAlimentos {

    FatsecretService fatsecretService = new FatsecretService("761c409480ec407bb5827cfcfafefdc0", "e5171477731d46e3bdf63a5746282d06");


    @Override
    public List<Food> getList(String alimento) {

        Response<CompactFood> response = fatsecretService.searchFoods(alimento);
        if (response != null) {
            List<Food> foods = new ArrayList<>();
            List<CompactFood> compactFoods = response.getResults();
            for (CompactFood x : compactFoods) {
                Food food = new Food();
                food = CompactFoodToFood.convertToFood(x);
                if (food != null) {
                    foods.add(food);
                }

            }
            return foods;

        } else {
            System.out.println("Sin resultados");
            return null;
        }
    }
}
