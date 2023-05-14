package com.uep.wap.service;

import com.uep.wap.dto.ProductDTO;
import com.uep.wap.model.Product;
import com.uep.wap.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public void addProduct(ProductDTO productDTO) {
        Product product = new Product();
        product.setName(productDTO.getName());
        product.setDesc(productDTO.getDesc());
        product.setSku(productDTO.getSku());
        product.setPrice(productDTO.getPrice());
        productRepository.save(product);
        System.out.println("New product added!");
    }

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
