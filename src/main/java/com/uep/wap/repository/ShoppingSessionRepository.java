package com.uep.wap.repository;

import com.uep.wap.model.ShoppingSession;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingSessionRepository extends CrudRepository<ShoppingSession, Integer> {

    ShoppingSession findById(int id);
}
