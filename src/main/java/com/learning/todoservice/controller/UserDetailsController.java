package com.learning.todoservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserDetailsController {

    Logger logger= LoggerFactory.getLogger(UserDetailsController.class);

    @GetMapping
    public ResponseEntity<String> getServerStatus() {
        logger.info("Server Started");
        return ResponseEntity.ok("Server is running");
    }
}
