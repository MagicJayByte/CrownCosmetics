package com.uep.wap.controller;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;
import com.uep.wap.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping(path = "users-list")
    public Iterable<User> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping(path = "users-list2")
    public List<User> getAllUsers2(){
        List<User> result = StreamSupport.stream(usersService.getAllUsers().spliterator(), false)
                .toList();
        return result;
    }

    @PostMapping(path = "add-user-data")
    public void addUserData(@RequestBody UserDTO user) {
        usersService.addUser(user);
    }

    @DeleteMapping("/delete-user-data/{id}")
    public void deleteUser(@PathVariable long id) {
        usersService.deleteUser(id);
    }
}
