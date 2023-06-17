package com.uep.wap.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.sql.Timestamp;

@Getter
@Setter
public class UserDTO {

    private String username;
    @NotEmpty(message = "Password should not be empty")
    private String password;
    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    private String firstName;
    private String lastName;
    private String telephone;


}

