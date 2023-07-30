package com.api.gateway.Controller.Room;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.gateway.Dto.RoomDto;

@RestController
@RequestMapping("/gateway/room")
public class GetStateRoomController {
    
    @GetMapping
    @RequestMapping("/state")
    public ResponseEntity<String> close(RoomDto RoomDto) {
        return new ResponseEntity<>("Get State Door", HttpStatus.OK);
    }

}
