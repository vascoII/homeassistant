package com.api.gateway.Controller.Door;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.Dto.DoorActionDto;

@RestController
@RequestMapping("/gateway/door")
public class CloseDoorController {
    
    @GetMapping
    @RequestMapping("/close")
    public ResponseEntity<String> close(DoorActionDto doorDto) {
        return new ResponseEntity<>("Close Door", HttpStatus.OK);
    }

}
