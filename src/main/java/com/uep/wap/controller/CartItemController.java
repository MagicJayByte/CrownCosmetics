package com.uep.wap.controller;

import com.uep.wap.model.CartItem;
import com.uep.wap.service.CartItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@RestController
@RequestMapping(path = "/cart-item")
public class CartItemController {

    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping(path="CartItems")
    public Iterable<CartItem> getAllCartItems() {return cartItemService.getAllCartItems();}



}
