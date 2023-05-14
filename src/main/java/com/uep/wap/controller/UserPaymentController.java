package com.uep.wap.controller;

import com.uep.wap.model.UserPayment;
import com.uep.wap.service.UsersPaymentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user_payment")
public class UserPaymentController {

    private final UsersPaymentService usersPaymentService;

    public UserPaymentController(UsersPaymentService usersPaymentService) {
        this.usersPaymentService = usersPaymentService;
    }

    @GetMapping(path = "UserPayments")
    public Iterable<UserPayment> getAllUserPayments(){
        return usersPaymentService.getAllUserPayments();
    }
}
