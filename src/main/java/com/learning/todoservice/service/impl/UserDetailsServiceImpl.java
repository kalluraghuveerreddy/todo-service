package com.learning.todoservice.service.impl;

import com.learning.todoservice.dto.request.UserDetailsRequest;
import com.learning.todoservice.dto.response.UserDetailsResponse;
import com.learning.todoservice.repository.UserRepository;
import com.learning.todoservice.service.IUserDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements IUserDetailsService {

    private final UserRepository userRepository;

    @Override
    public void createUserDetails(UserDetailsRequest userDetailsRequest) {

    }

    @Override
    public UserDetailsResponse findUserDetails(Long userId) {
        return null;
    }

    @Override
    public UserDetailsResponse findUserDetails(String name) {
        return null;
    }

    @Override
    public UserDetailsResponse findUserDetailsByEmail(String email) {
        return null;
    }

    @Override
    public void updateUserDetails(Long userId, UserDetailsRequest userDetailsRequest) {

    }

    @Override
    public void deleteUserDetails(Long userId) {

    }

    @Override
    public List<UserDetailsResponse> findAllUserDetails() {
        return List.of();
    }
}
