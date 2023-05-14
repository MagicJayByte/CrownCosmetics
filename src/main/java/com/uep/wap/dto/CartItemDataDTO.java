package com.uep.wap.dto;

import java.util.List;

public class CartItemDataDTO {

    private List<CartItemDTO> cartItems;

    public List<CartItemDTO> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItemDTO> cartItems) {
        this.cartItems = cartItems;
    }
}
