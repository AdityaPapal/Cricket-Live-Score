package com.cricket.api.controller;


import com.cricket.api.entities.match;
import com.cricket.api.service.matchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class matchController {

    private matchService match_Service;

    public matchController(matchService match_Service) {
        this.match_Service = match_Service;
    }

    // get live matches
    @GetMapping("/live")
    public ResponseEntity<List<match>> getLiveMatches(){
        return new ResponseEntity<>(this.match_Service.getLiveMatches(), HttpStatus.OK);
    }

    // get all matches
    @GetMapping()
    public ResponseEntity<List<match>> getAllMatches(){
        return new ResponseEntity<>(this.match_Service.getAllMatches(), HttpStatus.OK);
    }

    // get points table
    @GetMapping("/Points-table")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.match_Service.getPointTable(), HttpStatus.OK);
    }

}



