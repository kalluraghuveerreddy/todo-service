package com.learning.todoservice.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserDetailsController {

    @GetMapping
    public ResponseEntity<String> getServerStatus() {
        System.out.println("Server is running");
        return ResponseEntity.ok("Server is running");
    }
}
