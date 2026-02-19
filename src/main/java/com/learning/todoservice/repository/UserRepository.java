package com.learning.todoservice.repository;

import com.learning.todoservice.entity.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserDetails, Long> {

    Optional<UserDetails> findUserDetailsByEmail(String email);
    Optional<UserDetails> findUserDetailsByName(String name);

}
