package com.uep.wap.controller;

import com.uep.wap.model.Product;
import com.uep.wap.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public Iterable<Product> getAllProduct() {
        return productService.getAllProducts();
    }
}
