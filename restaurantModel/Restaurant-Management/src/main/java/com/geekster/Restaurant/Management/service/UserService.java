package com.geekster.Restaurant.Management.service;

import com.geekster.Restaurant.Management.model.User;
import com.geekster.Restaurant.Management.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String saveUser(User newUser) {
        userRepo.save(newUser);
        return "User Added";
    }

    public List<User> getUser() {
        return userRepo.findAll();
    }

    public String removeUser(Long id) {

        userRepo.deleteById(id);
        return "User removed";
    }

    public User getUserById(Long id) {
        return userRepo.findById(id).orElseThrow();
    }
}
