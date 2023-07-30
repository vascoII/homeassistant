package com.api.gateway.Controller.Room.Light;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.Dto.EquipmentDto;

@RestController
@RequestMapping("/gateway/light")
public class SwitchOffLightController {
    
    @GetMapping
    @RequestMapping("/switchoff")
    public ResponseEntity<String> close(EquipmentDto doorDto) {
        return new ResponseEntity<>("Switch off", HttpStatus.OK);
    }

}
