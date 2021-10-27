package com.backend.npocketbackend.services;

import com.backend.npocketbackend.dao.PCompositionDao;
import com.backend.npocketbackend.dao.PFoodsDao;
import com.backend.npocketbackend.models.Food;

import com.backend.npocketbackend.persistence.PersistenceComposition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersistenceCompositionImpl implements IPersistenceComposition {

    @Autowired
    PCompositionDao pCompositionDao;
    @Autowired
    PFoodsDao pFoodsDao;

    @Override
    public void addCompositions(List<Food> foodList) {
        List<PersistenceComposition> persistenceCompositionList = new ArrayList<>();
        for (Food food : foodList) {
            if (pFoodsDao.getByName(food.getName()).isPresent()&&food.getComposition().getProtein()!=null) {
                persistenceCompositionList.add(new PersistenceComposition(pFoodsDao.getByName(food.getName()).get().getId(), food.getComposition().getCalories(), food.getComposition().getFat(), food.getComposition().getCarbs(), food.getComposition().getProtein()));
            }
        }
        pCompositionDao.saveAll(persistenceCompositionList);
    }
}
