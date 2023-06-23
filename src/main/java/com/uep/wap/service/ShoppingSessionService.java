package com.uep.wap.service;

import com.uep.wap.dto.ShoppingSessionDTO;
import com.uep.wap.model.ShoppingSession;
import com.uep.wap.repository.ShoppingSessionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShoppingSessionService {

    @Autowired
    private ShoppingSessionRepository shoppingSessionRepository;

    public void addShoppingSession(ShoppingSessionDTO shoppingSessionDTO) {
        ShoppingSession shoppingSession = new ShoppingSession();
        shoppingSession.setTotal(shoppingSessionDTO.getTotal());
        shoppingSessionRepository.save(shoppingSession);
        System.out.println("New Shopping Session added!");
    }

    public Iterable<ShoppingSession> getAllShoppingSessions() {
        return shoppingSessionRepository.findAll();
    }

    public Optional<ShoppingSession> getShoppingSessionById(Integer id) {
        return shoppingSessionRepository.findById(id);
    }
}
