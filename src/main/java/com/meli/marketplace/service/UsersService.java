package com.meli.marketplace.service;

import java.util.List;

import com.meli.marketplace.models.User;

public interface UsersService {

    User postCreateNewUser(User entity);
    
    List<User> getAllUsers();
}
