package com.api.gateway.Controller.Light;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.Dto.LightActionDto;

@RestController
@RequestMapping("/gateway/light")
public class SwitchOnLightController {
    
    @GetMapping
    @RequestMapping("/open")
    public ResponseEntity<String> close(LightActionDto doorDto) {
        return new ResponseEntity<>("Switch On", HttpStatus.OK);
    }

}
