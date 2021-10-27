package com.backend.npocketbackend.dao;

import com.backend.npocketbackend.persistence.PersistenceComposition;
import org.springframework.data.repository.CrudRepository;

public interface PCompositionDao extends CrudRepository<PersistenceComposition, Integer> {
}
