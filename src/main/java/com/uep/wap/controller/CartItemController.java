package com.uep.wap.controller;

import com.uep.wap.dto.CartItemDTO;
import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.CartItem;
import com.uep.wap.model.Product;
import com.uep.wap.model.User;
import com.uep.wap.service.CartItemService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Controller
public class CartItemController {

    private final CartItemService cartItemService;

    public CartItemController(CartItemService cartItemService) {
        this.cartItemService = cartItemService;
    }

    @GetMapping(path="cart-items")
    public Iterable<CartItem> getAllCartItems() {return cartItemService.getAllCartItems();}

    @PostMapping(path="/save-cart-item")
    public String addCartItem(@ModelAttribute("cartItem") CartItem cartItem, @ModelAttribute("product") Product product) {
        cartItemService.saveCartItem(cartItem, product);
        return "product_view";
    }
    }




