package com.backend.npocketbackend.dao;

import com.backend.npocketbackend.persistence.PersistenceFoods;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PFoodsDao extends CrudRepository<PersistenceFoods,Integer> {
    Optional<PersistenceFoods> getByName(String name);
}
