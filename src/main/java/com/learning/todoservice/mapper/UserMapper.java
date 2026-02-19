package com.learning.todoservice.mapper;

import com.learning.todoservice.dto.request.UserDetailsRequest;
import com.learning.todoservice.entity.UserDetails;

public class UserMapper {

    public static UserDetailsRequest toUserDetailsRequest(UserDetails userDetails) {
        UserDetailsRequest userDetailsRequest = new UserDetailsRequest();
        userDetailsRequest.setUserName(userDetails.getName());
        userDetailsRequest.setUserEmail(userDetails.getEmail());
        return userDetailsRequest;
    }
        public static UserDetails toUserDetails(UserDetailsRequest userDetailsRequest) {
            UserDetails userDetails = new UserDetails();
            userDetails.setName(userDetailsRequest.getUserName());
            userDetails.setEmail(userDetailsRequest.getUserEmail());
            return userDetails;
        }
}
