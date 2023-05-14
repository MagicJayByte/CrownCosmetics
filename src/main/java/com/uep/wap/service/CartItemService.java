package com.uep.wap.service;

import com.uep.wap.dto.CartItemDTO;
import com.uep.wap.model.CartItem;
import com.uep.wap.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;

    public void addCartItem(CartItemDTO cartItemDTO) {
        CartItem cartItem = new CartItem();
        cartItem.setQuantity(cartItemDTO.getQuantity());
        cartItemRepository.save(cartItem);
        System.out.println("cartItem added!");
    }

    public Iterable<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

}
