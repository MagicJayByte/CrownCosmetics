package com.uep.wap.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class UserDTO {

    private String username;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String telephone;


}

