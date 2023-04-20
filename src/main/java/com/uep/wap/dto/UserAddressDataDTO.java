package com.uep.wap.dto;

import java.util.List;

public class UserAddressDataDTO {

    List<UserAddressDTO> usersAddresses;

    public List<UserAddressDTO> getUsersAddresses() {
        return usersAddresses;
    }

    public void setUsersAddresses(List<UserAddressDTO> usersAddresses) {
        this.usersAddresses = usersAddresses;
    }
}
