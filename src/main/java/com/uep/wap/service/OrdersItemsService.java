package com.uep.wap.service;

import com.uep.wap.model.OrderItems;
import com.uep.wap.repository.OrderItemsRepository;
import org.springframework.stereotype.Service;

@Service
public class OrdersItemsService {

    private OrderItemsRepository ordersItemsRepository;

    public void addOrderItems() {
        OrderItems orderItems = new OrderItems();
        orderItems.setQuantity(orderItems.getQuantity());
        orderItems.setCreated_at(orderItems.getCreated_at());
        orderItems.setModified_at(orderItems.getModified_at());
        ordersItemsRepository.save(orderItems);
        System.out.println("Order Items added!");
    }

    public Iterable<OrderItems> getAllOrdersItems() {
        return ordersItemsRepository.findAll();
    }
}
