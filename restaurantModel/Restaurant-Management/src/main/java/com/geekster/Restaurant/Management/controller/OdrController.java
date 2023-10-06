package com.geekster.Restaurant.Management.controller;

import com.geekster.Restaurant.Management.model.Odr;
import com.geekster.Restaurant.Management.service.OdrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OdrController {
    @Autowired
    OdrService odrService;

    @PostMapping("odr")
    public String addOdr(@RequestBody Odr newOdr)
    {
        return odrService.saveOdr(newOdr);
    }

    @GetMapping("Orders")
    public List<Odr> getOdr()
    {
        return OdrService.getOrder();
    }

    @DeleteMapping("odr/{id}")
    public String removeOdr(@PathVariable Long id)
    {
        return odrService.removeOdr(id);
    }

    @GetMapping("odr/{id}/id")
    public Odr getOdrById(@PathVariable Long id)
    {
        return odrService.getOdrById(id);
    }
}
