package com.geekster.employeeAddress.service;

import com.geekster.employeeAddress.model.Address;
import com.geekster.employeeAddress.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String saveAddress(Address newAddress) {
        addressRepo.save(newAddress);
        return "address added";
    }

    public List<Address> getAddress() {
        return addressRepo.findAll();
    }

    public String removeAddress(Long id) {
        addressRepo.deleteById(id);
        return "address removed";
    }


    public Address getAddressById(Long id) {
        return addressRepo.findById(id).orElseThrow();
    }
}
