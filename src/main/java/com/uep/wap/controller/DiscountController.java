package com.uep.wap.controller;

import com.uep.wap.model.Discount;
import com.uep.wap.service.DiscountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/discount")
public class DiscountController {

    private final DiscountService discountService;

    public DiscountController(DiscountService discountService) {
        this.discountService = discountService;
    }

    @GetMapping(path = "Discounts")
    public Iterable<Discount> getAllDiscounts() {
        return discountService.getAllDiscounts();
    }
}
