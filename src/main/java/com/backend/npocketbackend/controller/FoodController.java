package com.backend.npocketbackend.controller;

import com.backend.npocketbackend.models.Food;
import com.backend.npocketbackend.services.AlimentosImpl;

import com.backend.npocketbackend.services.PersistenceCompositionImpl;
import com.backend.npocketbackend.services.PersistenceFoodsImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class FoodController {
    @Autowired
    AlimentosImpl alimentosService;
    @Autowired
    PersistenceFoodsImpl persistenceFoods;
    @Autowired
    PersistenceCompositionImpl persistenceComposition;


    @GetMapping("/updateData/{query}")
    List<Food> getFoods(@PathVariable("query") String query) {
        List<Food> foods = alimentosService.getList(query);
        persistenceFoods.addFoods(foods);
        persistenceComposition.addCompositions(foods);
        return foods;
    }


}
