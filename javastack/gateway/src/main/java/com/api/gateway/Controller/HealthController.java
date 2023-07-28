package com.api.gateway.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gateway/health")
public class HealthController {
    
    @GetMapping
    public ResponseEntity<String> health() {
        return new ResponseEntity<>("Healthy", HttpStatus.OK);
    }
}
