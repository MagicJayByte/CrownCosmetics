package com.uep.wap.controller;

import com.uep.wap.model.OrderDetails;
import com.uep.wap.service.OrdersDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/orders-details")
public class OrderDetailsController {

    private final OrdersDetailsService ordersDetailsService;

    public OrderDetailsController(OrdersDetailsService ordersDetailsService) {
        this.ordersDetailsService = ordersDetailsService;
    }

    @GetMapping(path = "OrdersDetails")
    public Iterable<OrderDetails> getAllOrdersDetails(){
        return ordersDetailsService.getAllOrderDetails();
    }
}
