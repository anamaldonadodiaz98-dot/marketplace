package com.meli.marketplace.controller;

import org.springframework.web.bind.annotation.RestController;

import com.meli.marketplace.service.UsersService;

import java.util.List;
import com.meli.marketplace.models.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UsersController {

    private UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public List<User> getAllUsers () {
        return usersService.getAllUsers();
    }

    @PostMapping("/users")
    public User postCreateNewUser (@RequestBody User user) {
        return usersService.postCreateNewUser(user);
    }
    
}