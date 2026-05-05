package com.tripassistantbe.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class BreakController {

    @GetMapping("/break")
    public ResponseEntity<Map<String, String>> checkConnection() {
        return ResponseEntity.ok(Map.of(
                "status", "200",
                "message", "Pora na cska"
        ));
    }
}