package com.uep.wap.service;

import com.uep.wap.dto.UserDTO;
import com.uep.wap.model.Student;
import com.uep.wap.model.User;
import com.uep.wap.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UserRepository userRepository;

    public void addUser(UserDTO userDTO) {
        User user = new User();
        user.setFirst_name(userDTO.getFirst_name());
        user.setLast_name(userDTO.getLast_name());
        userRepository.save(user);
        System.out.println("User added!");
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
