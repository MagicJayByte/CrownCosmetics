package com.uep.wap.controller;

import com.uep.wap.model.UserAddress;
import com.uep.wap.service.UsersAddressesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user-address")
public class UserAddressController {

    private final UsersAddressesService usersAddressesService;

    public UserAddressController(UsersAddressesService usersAddressesService) {
        this.usersAddressesService = usersAddressesService;
    }

    @GetMapping(path = "UseresAddresses")
    public Iterable<UserAddress> getAllUsersAddresses(){
        return usersAddressesService.getAllUsersAddresses();
    }

}
