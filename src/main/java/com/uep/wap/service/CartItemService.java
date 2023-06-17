package com.uep.wap.service;

import com.uep.wap.dto.CartItemDTO;
import com.uep.wap.model.*;
import com.uep.wap.repository.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

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


    public void addCartItem(Product product, User user, int numItems) {
        if (user.getShoppingSession() != null) {
            ShoppingSession shoppingSession = user.getShoppingSession();

            ProductInventory inventory = product.getProductInventory();
            inventory.setQuantity(inventory.getQuantity() - numItems);
            shoppingSession.setTotal(product.getPrice()*numItems);
        }
    }

//    public CartItem createCartItem(Model model) {
//
//    }
}
