package com.uep.wap.controller;

import com.uep.wap.model.ShoppingSession;
import com.uep.wap.service.ShoppingSessionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/shopping-session")
public class ShoppingSessionController {

    private final ShoppingSessionService shoppingSessionService;

    public ShoppingSessionController(ShoppingSessionService shoppingSessionService) {
        this.shoppingSessionService = shoppingSessionService;
    }

    @GetMapping(path = "ShoppingSessions")
    public Iterable<ShoppingSession> getAllShoppingSessions() {
        return shoppingSessionService.getAllShoppingSessions();
    }

    }

