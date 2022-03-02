package com.codeclan.example.PirateService.Repositories;

import com.codeclan.example.PirateService.Models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

}
