package com.uep.wap.service;

import com.uep.wap.dto.UserAddressDTO;
import com.uep.wap.model.UserAddress;
import com.uep.wap.repository.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersAddressesService {

    @Autowired
    private UserAddressRepository userAddressRepository;

    public void addUserAddress(UserAddressDTO userAddressDTO) {
        UserAddress userAddress = new UserAddress();
        userAddress.setStreet(userAddressDTO.getStreet());
        userAddress.setZip(userAddressDTO.getZip());
        userAddress.setCity(userAddressDTO.getCity());
        userAddress.setState(userAddressDTO.getState());
        userAddress.setCountry(userAddressDTO.getCountry());
        userAddress.setPhone(userAddressDTO.getPhone());
        userAddress.setMobile(userAddressDTO.getMobile());
        userAddressRepository.save(userAddress);
        System.out.println("User Address added!");
    }

    public Iterable<UserAddress> getAllUsersAddresses() {
        return userAddressRepository.findAll();
    }
}
