package com.uep.wap.controller;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.User;
import com.uep.wap.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


//@RestController
//@RequestMapping(path = "/user")
@Controller
public class UserController {

    @Autowired
    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }


    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("user") User user) {
        usersService.saveUser(user);
        return "redirect:/";
    }

    @GetMapping("/add-new")
    public String addNewUser(Model model) {
        UserDTO user = new UserDTO();

        model.addAttribute("user", user);
        return "new_user";
    }

        @GetMapping(path = "/index")
    public String home(Model model) {
        model.addAttribute("users", usersService.getAllUsers());
        return "index";
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
    public String login() {
        return "login";
    }

//    @GetMapping("/show-user/{id}")
//    public String viewUser(@PathVariable(value = "id") long id, Model model) {
//        User userToView = usersService.getUserById(id);
//        model.addAttribute("user", userToView);
//        return "user_view";
//    }

    @GetMapping("/show-user")
    public String getUserPage(Model model) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (authentication.getPrincipal() instanceof UserDetails) {
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            String username = userDetails.getUsername();
            model.addAttribute("user", usersService.findUserByUsername(username));
        }
        return "user_view";
    }

}
