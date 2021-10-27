package com.backend.npocketbackend.services;

import com.backend.npocketbackend.models.Food;

import java.util.List;

public interface IPersistenceFood {
    void addFoods(List<Food> persistenceFoods);

}
