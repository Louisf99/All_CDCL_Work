package com.codeclan.example.pirateservice.repositories;

import com.codeclan.example.pirateservice.models.Raid;
import com.codeclan.example.pirateservice.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RaidRepository extends JpaRepository<Raid, Long> {

    List <Raid> findByPirateShip(Ship ship);
}
