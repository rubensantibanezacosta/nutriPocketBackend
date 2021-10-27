package com.backend.npocketbackend.services;

import com.backend.npocketbackend.dao.PFoodsDao;
import com.backend.npocketbackend.models.Food;
import com.backend.npocketbackend.persistence.PersistenceFoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersistenceFoodsImpl implements IPersistenceFood {
    @Autowired
    PFoodsDao pFoodsDao;

    @Override
    public void addFoods(List<Food> foods) {
        List<PersistenceFoods> persistenceFoods = new ArrayList<>();
        for (int i=0;i<10; i++) {
            if (!pFoodsDao.getByName(foods.get(i).getName()).isPresent()) {
                persistenceFoods.add(new PersistenceFoods(foods.get(i).getName()));
            }
        }
        pFoodsDao.saveAll(persistenceFoods);
    }
}
