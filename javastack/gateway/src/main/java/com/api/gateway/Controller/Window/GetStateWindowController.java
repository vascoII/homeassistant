package com.api.gateway.Controller.Window;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.Dto.WindowActionDto;

@RestController
@RequestMapping("/gateway/window")
public class GetStateWindowController {
    
    @GetMapping
    @RequestMapping("/state")
    public ResponseEntity<String> close(WindowActionDto doorDto) {
        return new ResponseEntity<>("Get State Window", HttpStatus.OK);
    }

}
