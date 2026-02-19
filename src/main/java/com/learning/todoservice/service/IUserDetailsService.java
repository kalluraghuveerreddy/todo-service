package com.learning.todoservice.service;

import com.learning.todoservice.dto.request.UserDetailsRequest;
import com.learning.todoservice.dto.response.UserDetailsResponse;
import com.learning.todoservice.entity.UserDetails;

import java.util.List;

public interface IUserDetailsService {
    void createUserDetails(UserDetailsRequest userDetailsRequest);

    UserDetailsResponse findUserDetails(Long userId);

    UserDetailsResponse findUserDetails(String name);

    UserDetailsResponse findUserDetailsByEmail(String email);

    void updateUserDetails(Long userId, UserDetailsRequest userDetailsRequest);

    void deleteUserDetails(Long userId);

    List<UserDetailsResponse> findAllUserDetails();
}
