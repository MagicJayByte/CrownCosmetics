package com.uep.wap.service;


import com.uep.wap.dto.ProductCategoryDTO;
import com.uep.wap.model.ProductCategory;
import com.uep.wap.repository.ProductCategoryRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductCategoryService {

    private ProductCategoryRepository productCategoryRepository;

    public void addProductCategory(ProductCategoryDTO productCategoryDTO) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setName(productCategoryDTO.getName());
        productCategory.setDesc(productCategoryDTO.getDesc());
        productCategoryRepository.save(productCategory);
        System.out.println("New Product Category added!");
    }

    public Iterable<ProductCategory> getAllProductCategories() {
        return productCategoryRepository.findAll();
    }
}
