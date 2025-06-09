package com.port4dev.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class KeepAliveService {
    
    private final RestTemplate restTemplate = new RestTemplate();
    private final String serverUrl = "https://port4dev-xh8k.onrender.com";

    @Scheduled(fixedRate = 10 * 60 * 1000) // 10분마다 실행
    public void keepAlive() {
        try {
            String response = restTemplate.getForObject(serverUrl + "/api/ping", String.class);
            System.out.println("Keep-Alive ping sent: " + response);
        } catch (Exception e) {
            System.err.println("Keep-Alive error: " + e.getMessage());
        }
    }
} 