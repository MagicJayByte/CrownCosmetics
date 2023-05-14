package com.uep.wap.dto;

import java.util.List;

public class OrdersItemsDataDTO {

    List<OrderItemsDTO> ordersItems;

    public List<OrderItemsDTO> getOrdersItems() {
        return ordersItems;
    }

    public void setOrdersItems(List<OrderItemsDTO> ordersItems) {
        this.ordersItems = ordersItems;
    }
}
