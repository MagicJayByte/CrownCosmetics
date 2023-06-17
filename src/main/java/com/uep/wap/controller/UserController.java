package com.uep.wap.controller;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;
import com.uep.wap.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import java.util.ArrayList;
import java.util.List;

//@RestController
//@RequestMapping(path = "/user")
@Controller
public class UserController {

    @Autowired
    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

//    @GetMapping(path = "/")
//    public String home(Model model) {
//        model.addAttribute("users", usersService.getAllUsers());
//        return "index";
//    }

    @GetMapping("/add-new")
    public String addNewUser(Model model) {
        UserDTO user = new UserDTO();

        model.addAttribute("user", user);
        return "new_user";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("user") User user) {
        usersService.saveUser(user);
        return "redirect:/";
    }


    @GetMapping("/showFormForUpdate/{id}")
    public String updateForm(@PathVariable(value = "id") long id, Model model) {
        User userToUpdate = usersService.getUserById(id);
        model.addAttribute("user", userToUpdate);
        return "update";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteThroughId(@PathVariable(value = "id") long id) {
        usersService.deleteUser(id);
        return "redirect:/";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }
}
