package com.uep.wap.controller;

import com.uep.wap.model.PaymentDetails;
import com.uep.wap.service.PaymentsDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/payment-details")
public class PaymentDetailsController {

    private final PaymentsDetailsService paymentDetailsService;

    public PaymentDetailsController(PaymentsDetailsService paymentDetailsService) {
        this.paymentDetailsService = paymentDetailsService;
    }

    @GetMapping(path = "PaymentsDetails")
    public Iterable<PaymentDetails> getAllPaymentsDetails(){
        return paymentDetailsService.getAllPaymentDetails();
    }
}
