package com.meli.marketplace.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.meli.marketplace.models.User;

public interface UsersRepository extends JpaRepository<User, Long> {

}
