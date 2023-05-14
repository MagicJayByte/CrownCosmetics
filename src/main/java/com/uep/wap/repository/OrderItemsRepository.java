package com.uep.wap.repository;

import com.uep.wap.model.OrderItems;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemsRepository extends CrudRepository<OrderItems, Long> {}
