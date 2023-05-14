package com.uep.wap.service;

import com.uep.wap.dto.PaymentDetailsDTO;
import com.uep.wap.model.PaymentDetails;
import com.uep.wap.repository.PaymentDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentsDetailsService {

    @Autowired
    private PaymentDetailsRepository paymentDetailsRepository;

    public void addPaymentDetails(PaymentDetailsDTO paymentDetailsDTO) {
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setAmount(paymentDetailsDTO.getAmount());
        paymentDetails.setProvider(paymentDetailsDTO.getProvider());
        paymentDetails.setStatus(paymentDetailsDTO.getStatus());
        paymentDetails.setCreatedAt(paymentDetailsDTO.getCreatedAt());
        paymentDetails.setModifiedAt(paymentDetailsDTO.getModifiedAt());
        paymentDetailsRepository.save(paymentDetails);
        System.out.println("Payment details added!");
    }

    public Iterable<PaymentDetails> getAllPaymentDetails() {
        return paymentDetailsRepository.findAll();
    }
}
