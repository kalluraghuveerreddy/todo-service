package com.learning.todoservice.controller;

import com.learning.todoservice.dto.request.UserDetailsRequest;
import com.learning.todoservice.dto.response.UserDetailsResponse;
import com.learning.todoservice.service.IUserDetailsService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserDetailsController {

    private final Logger logger = LoggerFactory.getLogger(UserDetailsController.class);
    private final IUserDetailsService userDetailsService;

    @GetMapping("/pingCheck")
    public ResponseEntity<String> getServerStatus() {
        return ResponseEntity.ok("Server is UP");
    }

    @PostMapping("/create-user")
    public ResponseEntity<String> createUser(@RequestBody UserDetailsRequest userDetailsRequest) {
        userDetailsService.createUserDetails(userDetailsRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

    @GetMapping("/fetch-user/{id}")
    public ResponseEntity<UserDetailsResponse> fetchUserById(@PathVariable Long id) {
        UserDetailsResponse userDetails = userDetailsService.findUserDetails(id);
        if (userDetails != null) {
            return ResponseEntity.ok(userDetails);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/fetch-users-list")
    public ResponseEntity<List<UserDetailsResponse>> fetchUsersList() {
        List<UserDetailsResponse> userList = userDetailsService.findAllUserDetails();
        return ResponseEntity.ok(userList);
    }

}
