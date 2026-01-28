package com.meli.marketplace.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.meli.marketplace.repository.UsersRepository;
import com.meli.marketplace.models.User;

@Service
public class UsersServiceLmpl implements UsersService {

    private final UsersRepository usersRepository;

    public UsersServiceLmpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }
    
    @Override
    public User postCreateNewUser(User entity) {
        return usersRepository.save(entity);
    }  

    @Override
    public List<User> getAllUsers() {
        return usersRepository.findAll();
    }
}
