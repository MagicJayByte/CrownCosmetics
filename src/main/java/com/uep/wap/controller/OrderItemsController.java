package com.uep.wap.controller;

import com.uep.wap.model.OrderItems;
import com.uep.wap.service.OrdersItemsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order-items")
public class OrderItemsController {

    private final OrdersItemsService ordersItemsService;

    public OrderItemsController(OrdersItemsService ordersItemsService) {
        this.ordersItemsService = ordersItemsService;
    }

    @GetMapping(path = "/orderItems")
    public Iterable<OrderItems> getAllOrderItems(){
        return ordersItemsService.getAllOrdersItems();
    }
}
