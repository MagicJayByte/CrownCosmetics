package com.uep.wap.service;

import com.uep.wap.dto.UserPaymentDTO;
import com.uep.wap.model.UserPayment;
import com.uep.wap.repository.UserPaymentRepository;
import org.springframework.stereotype.Service;

@Service
public class UsersPaymentService {

    private UserPaymentRepository userPaymentRepository;


    //dodanie przeslanych przez uzytkowniak danych(DTO) do bazy danych
    public void addUserPayment(UserPaymentDTO userPaymentDTO) {
        UserPayment userPayment = new UserPayment();
        userPayment.setPayment_type(userPaymentDTO.getPayment_type());
        userPayment.setProvider(userPaymentDTO.getProvider());
        userPayment.setAccount_number(userPaymentDTO.getAccount_number());
        userPayment.setIBAN_number(userPaymentDTO.getIBAN_number());
        userPayment.setCard_number(userPaymentDTO.getCard_number());
        userPayment.setExpire_date(userPaymentDTO.getExpire_date());
        userPaymentRepository.save(userPayment);
        System.out.println("Payment added!");
    }

    //pobranie wszystkich danych z bazy danych
    public Iterable<UserPayment> getAllUserPayments() {
        return userPaymentRepository.findAll();
    }
}
