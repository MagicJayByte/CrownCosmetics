package com.uep.wap.service;

import com.uep.wap.dto.ProductInventoryDTO;
import com.uep.wap.model.ProductInventory;
import com.uep.wap.repository.ProductInventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductInventoryService {

    @Autowired
    private ProductInventoryRepository productInventoryRepository;

    public void addProductInventory(ProductInventoryDTO productInventoryDTO) {
        ProductInventory productInventory = new ProductInventory();
        productInventory.setQuantity(productInventoryDTO.getQuantity());
        productInventoryRepository.save(productInventory);
        System.out.println("New Product Inventory added!");
    }

    public Iterable<ProductInventory> getAllProductInventories() {
        return productInventoryRepository.findAll();
    }


}
