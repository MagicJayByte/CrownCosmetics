package com.uep.wap.controller;

import com.uep.wap.dto.ProductDTO;
import com.uep.wap.model.Product;
import com.uep.wap.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    public Iterable<Product> getAllProduct() {
        return productService.getAllProducts();
    }

    @PostMapping(path = "/add-product-data")
    public void addProduct(@RequestBody ProductDTO product) {
        productService.addProduct(product);
    }


}
