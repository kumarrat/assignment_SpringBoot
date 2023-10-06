package com.geekster.Restaurant.Management.controller;

import com.geekster.Restaurant.Management.model.User;
import com.geekster.Restaurant.Management.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User newUser)
    {
        return userService.saveUser(newUser);
    }

    @GetMapping("users")
    public List<User> getUser()
    {
        return userService.getUser();
    }

    @DeleteMapping("user/{id}")
    public String removeUser(@PathVariable Long id)
    {
        return userService.removeUser(id);
    }

    @GetMapping("User/{id}/id")
    public User getUserById(@PathVariable Long id)
    {
        return userService.getUserById(id);
    }
}
