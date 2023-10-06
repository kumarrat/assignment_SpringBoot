package com.geekster.Restaurant.Management.service;

import com.geekster.Restaurant.Management.model.Odr;
import com.geekster.Restaurant.Management.repo.IOdrRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OdrService {

    @Autowired
    static IOdrRepo odrRepo;

    public static List<Odr> getOrder() {
        return odrRepo.findAll();
    }

    public String saveOdr(Odr newOdr) {

        odrRepo.save(newOdr);
        return "Order Added";
    }

    public String removeOdr(Long id) {
        odrRepo.deleteById(id);
        return "Odr removed";
    }

    public Odr getOdrById(Long id) {
        return odrRepo.findById(id).orElseThrow();
    }
}
