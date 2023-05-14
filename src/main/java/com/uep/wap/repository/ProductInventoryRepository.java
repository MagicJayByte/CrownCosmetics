package com.uep.wap.repository;

import com.uep.wap.model.ProductInventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInventoryRepository extends CrudRepository<ProductInventory, Integer> {


}
