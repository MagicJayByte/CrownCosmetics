package com.uep.wap.controller;

import com.uep.wap.model.ProductCategory;
import com.uep.wap.service.ProductCategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/product-category")
public class ProductCategoryController {

    private final ProductCategoryService productCategoryService;

    public ProductCategoryController(ProductCategoryService productCategoryService) {
        this.productCategoryService = productCategoryService;
    }

    @GetMapping(path = "ProductCategories")
    public Iterable<ProductCategory> getAllProductCategories() {
        return productCategoryService.getAllProductCategories();
    }
}
