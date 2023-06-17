package com.uep.wap.controller;

import com.uep.wap.dto.CartItemDTO;
import com.uep.wap.dto.ProductDTO;
import com.uep.wap.model.Product;
import com.uep.wap.model.ShoppingSession;
import com.uep.wap.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(path = "/products")
    public String getAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "shop";
    }

    @GetMapping(path = "/")
    public String home(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "shop";
    }

    @PostMapping(path = "/add-product-data")
    public void addProduct(@RequestBody ProductDTO product) {
        productService.addProduct(product);
    }

    @GetMapping("/view-product/{id}")
    public String viewProduct(@PathVariable(value = "id") long id, Model model) {
        Product productToView = productService.getProductById(id);
        model.addAttribute("product", productToView);
        return "product_view";
    }




}
