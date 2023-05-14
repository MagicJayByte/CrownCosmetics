package com.uep.wap.dto;

import java.util.List;

public class OrdersDetailsDataDTO {

    List<OrderDetailsDTO> ordersDetails;

    public List<OrderDetailsDTO> getOrders() {
        return ordersDetails;
    }

    public void setOrders(List<OrderDetailsDTO> orders) {
        this.ordersDetails = orders;
    }
}
