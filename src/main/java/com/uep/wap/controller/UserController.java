package com.uep.wap.controller;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;
import com.uep.wap.service.UsersService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "users-list")
    public Iterable<User> getAllUsers(){
        return usersService.getAllUsers();
    }

    @PostMapping(path = "add-user-data")
    public void addUserData(@RequestBody UserDTO user) {
        usersService.addUser(user);
    }

    @DeleteMapping (path = "delete-user-data")
    public void deleteUserData(@RequestParam Long id) {
        usersService.deleteUser(id);
    }
}
