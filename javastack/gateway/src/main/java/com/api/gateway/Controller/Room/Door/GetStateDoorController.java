package com.api.gateway.Controller.Room.Door;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.Dto.EquipmentDto;

@RestController
@RequestMapping("/gateway/door")
public class GetStateDoorController {
    
    @GetMapping
    @RequestMapping("/state")
    public ResponseEntity<String> close(EquipmentDto doorDto) {
        return new ResponseEntity<>("Get State Door", HttpStatus.OK);
    }

}
