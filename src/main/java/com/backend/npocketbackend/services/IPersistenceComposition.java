package com.backend.npocketbackend.services;

import com.backend.npocketbackend.models.Food;

import java.util.List;

public interface IPersistenceComposition {
    void addCompositions(List<Food> foodList);
}
