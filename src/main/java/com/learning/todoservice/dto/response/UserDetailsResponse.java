package com.learning.todoservice.dto.response;

import lombok.Data;

@Data
public class UserDetailsResponse {
    private Long userId;
    private String userName;
    private String userEmail;
}
