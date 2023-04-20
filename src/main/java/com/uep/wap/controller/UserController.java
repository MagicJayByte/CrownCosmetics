package com.uep.wap.controller;

import com.uep.wap.model.User;
import com.uep.wap.service.UsersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "Users")
    public Iterable<User> getAllUsers(){
        return usersService.getAllUsers();
    }
}
