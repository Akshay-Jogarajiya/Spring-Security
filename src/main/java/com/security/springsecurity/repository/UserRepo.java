package com.security.springsecurity.repository;

import com.security.springsecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
