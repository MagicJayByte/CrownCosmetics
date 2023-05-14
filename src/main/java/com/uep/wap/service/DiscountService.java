package com.uep.wap.service;

import com.uep.wap.dto.DiscountDTO;
import com.uep.wap.model.Discount;
import com.uep.wap.repository.DiscountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    public void addDiscount(DiscountDTO discountDTO) {
        Discount discount = new Discount();
        discount.setName(discountDTO.getName());
        discount.setDesc(discountDTO.getDesc());
        discount.setDiscPercent(discountDTO.getDisc_percent());
        discount.setActive(discountDTO.isActive());
        discountRepository.save(discount);
        System.out.println("Discount added!");
    }

    public Iterable<Discount> getAllDiscounts() {
        return discountRepository.findAll();
    }
}
