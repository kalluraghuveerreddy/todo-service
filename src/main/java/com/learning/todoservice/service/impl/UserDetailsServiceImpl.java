package com.learning.todoservice.service.impl;

import com.learning.todoservice.dto.request.UserDetailsRequest;
import com.learning.todoservice.dto.response.UserDetailsResponse;
import com.learning.todoservice.entity.UserDetails;
import com.learning.todoservice.mapper.UserMapper;
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
        UserDetails userDetails = UserMapper.toUserDetails(userDetailsRequest);
        userRepository.save(userDetails);
    }

    @Override
    public UserDetailsResponse findUserDetails(Long userId) {
        return userRepository.findById(userId)
                .map(UserMapper::toUserDetailsResponse)
                .orElse(null);
    }

    @Override
    public UserDetailsResponse findUserDetails(String name) {
        return userRepository.findUserDetailsByName(name)
                .map(UserMapper::toUserDetailsResponse)
                .orElse(null);
    }

    @Override
    public UserDetailsResponse findUserDetailsByEmail(String email) {
        return userRepository.findUserDetailsByEmail(email)
                .map(UserMapper::toUserDetailsResponse)
                .orElse(null);
    }

    @Override
    public void updateUserDetails(Long userId, UserDetailsRequest userDetailsRequest) {
        userRepository.findById(userId).ifPresent(userDetails -> {
            userDetails.setName(userDetailsRequest.getUserName());
            userDetails.setEmail(userDetailsRequest.getUserEmail());
            userRepository.save(userDetails);
        });
    }

    @Override
    public void deleteUserDetails(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<UserDetailsResponse> findAllUserDetails() {
        return userRepository.findAll()
                .stream()
                .map(UserMapper::toUserDetailsResponse)
                .toList();
    }
}
