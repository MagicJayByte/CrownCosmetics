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

    @GetMapping(path="add-cart-item")
    public String addCartItem(Model model) {
        CartItemDTO cartItemDTO = new CartItemDTO();
        model.addAttribute("cartItem", cartItemDTO);
        return "product_view";
    }


    }




