package com.codeclan.example.PirateService.Controllers;


import com.codeclan.example.PirateService.Models.Pirate;
import com.codeclan.example.PirateService.Repositories.PirateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PirateController {
    @Autowired
    PirateRepository pirateRepository;

    @GetMapping(value = "/pirates")
    public List<Pirate> getAllPirates() {
        return pirateRepository.findAll();
    }

    @GetMapping(value = "/pirates/{id}")
    public Optional<Pirate> getPirate(@PathVariable Long id) {
        return pirateRepository.findById(id);
    }

    @GetMapping(value = "/pirates/getbyname/{firstname}")
    public Optional<Pirate> getPirateByName(@PathVariable String firstname){
        return null;
    }
}
