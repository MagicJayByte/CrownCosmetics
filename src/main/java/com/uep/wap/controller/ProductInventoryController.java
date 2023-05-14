package com.uep.wap.controller;

import com.uep.wap.model.ProductInventory;
import com.uep.wap.service.ProductInventoryService;
import com.uep.wap.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/product-inventory")
public class ProductInventoryController {

    private final ProductInventoryService productInventoryService;

    public ProductInventoryController(ProductInventoryService productInventoryService) {
        this.productInventoryService = productInventoryService;
    }

    @GetMapping(path = "ProductInventories")
    Iterable<ProductInventory> getAllProductInventories() {
        return productInventoryService.getAllProductInventories();
    }
}
