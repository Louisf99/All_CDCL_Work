package com.codeclan.example.pirateservice.controllers;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {
    @Autowired
    PirateRepository pirateRepository;

    @GetMapping(value = "/pirates")
    public ResponseEntity <List<Pirate>> getAllPirates(){
        return new ResponseEntity<>(pirateRepository.findAll(), HttpStatus.ACCEPTED);
    }

    @GetMapping(value = "/pirates/{id}")
    public ResponseEntity <Optional<Pirate>> getPirate(@PathVariable Long id){
        return new ResponseEntity<>(pirateRepository.findById(id), HttpStatus.OK);
    }

    @GetMapping(value = "/pirates/{id}/raids")
    public ResponseEntity <List<Raid>> getRaidsByPirate(@PathVariable Long id){
        return new ResponseEntity<>(pirateRepository.getById(id).getRaids(), HttpStatus.OK);
    }

    @PostMapping(value = "/pirates")
    public ResponseEntity<Pirate> postPirate(@RequestBody Pirate pirate){
        pirateRepository.save(pirate);
        return new ResponseEntity<>(pirate,HttpStatus.CREATED);
    }

    @GetMapping(value = "/pirates/getbyfirstname")
    public List<Pirate> getPirateByName(@RequestParam(name = "firstname") String firstName){
        return  pirateRepository.findPiratesByFirstName(firstName);
    }

    @GetMapping(value = "/pirates/getbylastname")
    public ResponseEntity <List<Pirate>>getPirateByLastName(@RequestParam(name = "lastname") String lastName){
        return new ResponseEntity<>(pirateRepository.findPiratesByLastName(lastName),HttpStatus.OK);
    }

    @GetMapping(value = "/pirates/getbyage")
    public List<Pirate> getPirateByAge(@RequestParam(name = "age") int age){
        return  pirateRepository.findPiratesByAge(age);
    }

    @GetMapping(value = "/pirates/getoldpirates")
    public ResponseEntity <List<Pirate>> getOldPirates(){
        return new ResponseEntity<>(pirateRepository.findByAgeGreaterThan(40),HttpStatus.OK);
    }

    @GetMapping(value = "/pirates/getpiratesbyageandlastname")
    public ResponseEntity <List<Pirate>> getPirateByAgeAndLastName(@RequestParam(name = "age")int age, @RequestParam(name = "lastname")String lastname){
        return new ResponseEntity<>(pirateRepository.findPiratesByAgeAndLastName(age, lastname), HttpStatus.OK);
    }

    @GetMapping(value = "/pirates/byraid")
    public ResponseEntity<List<Pirate>> getPiratesByRaidsId(@RequestParam(name = "raidid") long id){
        return new ResponseEntity<>(pirateRepository.findByRaidsId(id),HttpStatus.OK);
    }


    }






