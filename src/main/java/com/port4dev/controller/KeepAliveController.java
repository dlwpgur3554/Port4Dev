package com.port4dev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin(origins = "*")
public class KeepAliveController {
    
    @GetMapping("/api/ping")
    public String ping() {
        return "pong";
    }
} 