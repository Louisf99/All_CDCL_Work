package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Ship;
import com.codeclan.example.pirateservice.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ShipController {
    @Autowired
    ShipRepository shipRepository;

    @GetMapping(value = "/ships")
    public ResponseEntity <List<Ship>> getAllShips(){
        return new ResponseEntity<>(shipRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/ships/{id}")
    public ResponseEntity <Optional<Ship>> getShip(@PathVariable Long id){
        return new ResponseEntity<>(shipRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/ships/{id}/pirates")
    public ResponseEntity <List<Pirate>> getPiratesByShip(@PathVariable Long id){
        return new ResponseEntity<>(shipRepository.getById(id).getPirates(), HttpStatus.OK);
    }

    @PostMapping(value = "/ships")
    public ResponseEntity<Ship> createShip(@RequestBody Ship ship){
        shipRepository.save(ship);
        return new ResponseEntity<>(ship, HttpStatus.CREATED);
    }
    @PostMapping(value = "/ships/{id}")
    public ResponseEntity <Ship> updateShip(@RequestBody Ship ship){
        shipRepository.save(ship);
        return new ResponseEntity<>(ship, HttpStatus.CREATED);
    }

    @GetMapping (value = "/ships/getshipsbypirateid")
    public ResponseEntity<List<Ship>> getShipsByPirateId(@RequestParam(name = "pirateid") long id){
        return new ResponseEntity<>(shipRepository.findShipByPiratesId(id), HttpStatus.OK);
    }

}
