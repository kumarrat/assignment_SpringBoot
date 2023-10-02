package com.geekster.employeeAddress.controller;

import com.geekster.employeeAddress.model.Address;
import com.geekster.employeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress)
    {
        return addressService.saveAddress(newAddress);
    }

    @GetMapping("Address")
    public List<Address> getAddress()
    {
        return addressService.getAddress();
    }

    @DeleteMapping("address/{id}")
    public String removeAddress(@PathVariable Long id)
    {
        return addressService.removeAddress(id);
    }

    @GetMapping("address/{id}/id")
    public Address getAddressById(@PathVariable Long id)
    {
        return addressService.getAddressById(id);
    }
}
