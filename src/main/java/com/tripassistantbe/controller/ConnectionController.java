package com.tripassistantbe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ConnectionController {

    @GetMapping("/checkConnection")
    public ResponseEntity<Map<String, String>> checkConnection() {
        return ResponseEntity.ok(Map.of(
                "status", "UP",
                "message", "Connection works"
        ));
    }
}