package com.learning.todoservice.mapper;

import com.learning.todoservice.dto.request.UserDetailsRequest;
import com.learning.todoservice.dto.response.UserDetailsResponse;
import com.learning.todoservice.entity.UserDetails;

public class UserMapper {

    public static UserDetailsResponse toUserDetailsResponse(UserDetails userDetails) {
        UserDetailsResponse userDetailsResponse = new UserDetailsResponse();
        userDetailsResponse.setUserId(userDetails.getId());
        userDetailsResponse.setUserName(userDetails.getName());
        userDetailsResponse.setUserEmail(userDetails.getEmail());
        return userDetailsResponse;
    }

    public static UserDetails toUserDetails(UserDetailsRequest userDetailsRequest) {
        UserDetails userDetails = new UserDetails();
        userDetails.setName(userDetailsRequest.getUserName());
        userDetails.setEmail(userDetailsRequest.getUserEmail());
        return userDetails;
    }
}
