package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.repositories.RaidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class RaidController {
    @Autowired
    RaidRepository  raidRepository;

    @GetMapping(value = "/raids")
    public ResponseEntity <List<Raid>> getAllRaids(){
        return new ResponseEntity<>(raidRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/raids/{id}")
    public ResponseEntity <Optional<Raid>> getRaid(@PathVariable Long id){
        return new ResponseEntity<>(raidRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/raids")
    public ResponseEntity<Raid> createRaid(@RequestBody Raid raid){
        raidRepository.save(raid);
        return new ResponseEntity<>(raid, HttpStatus.CREATED);
    }

//    @GetMapping(value = "/raids/bypiratesshipname")
//    public new ResponseEntity<List<Raid>> getRaidsByPiratesShipName(@RequestParam(name = "shipname") String name){
//
//    }
}
