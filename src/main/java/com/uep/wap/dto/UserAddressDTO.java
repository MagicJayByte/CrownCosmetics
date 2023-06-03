package com.uep.wap.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserAddressDTO {

    private long id;
    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String phone;
    private String mobile;

}
