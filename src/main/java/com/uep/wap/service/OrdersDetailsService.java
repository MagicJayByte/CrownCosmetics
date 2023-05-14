package com.uep.wap.service;

import com.uep.wap.dto.OrdersDetailsDataDTO;
import com.uep.wap.model.OrderDetails;
import com.uep.wap.repository.OrderDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersDetailsService {

    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    public void addOrderDetails(OrdersDetailsDataDTO ordersDetailsDataDTO) {
        OrderDetails orderDetails = new OrderDetails();
        orderDetails.setTotalPrice(orderDetails.getTotalPrice());
        orderDetails.setCreatedAt(orderDetails.getCreatedAt());
        orderDetails.setModifiedAt(orderDetails.getModifiedAt());
        orderDetailsRepository.save(orderDetails);
        System.out.println("Order details added!");
    }

    public Iterable<OrderDetails> getAllOrderDetails() {
        return orderDetailsRepository.findAll();
    }
}
