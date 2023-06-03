package com.uep.wap.controller;

import com.uep.wap.dto.UserAddressDTO;
import com.uep.wap.model.UserAddress;
import com.uep.wap.service.UsersAddressesService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user-address")
public class UserAddressController {

    private final UsersAddressesService usersAddressesService;

    public UserAddressController(UsersAddressesService usersAddressesService) {
        this.usersAddressesService = usersAddressesService;
    }

    @GetMapping(path = "/user-addresses")
    public Iterable<UserAddress> getAllUsersAddresses(){
        return usersAddressesService.getAllUsersAddresses();
    }

    @PostMapping(path = "/add-user-address")
    public void addUserAddress(@RequestBody UserAddressDTO userAddress){
        usersAddressesService.addUserAddress(userAddress);
    }

}
