package com.codeclan.example.pirateservice.repositories;

import com.codeclan.example.pirateservice.models.Pirate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PirateRepository extends JpaRepository<Pirate, Long> {

    List<Pirate> findPiratesByFirstName(String firstName);

    List<Pirate> findPiratesByLastName(String lastName);

    List<Pirate> findPiratesByAge (int age);

    List<Pirate> findByAgeGreaterThan (int age);

    List<Pirate> findPiratesByAgeAndLastName (int age, String lastName);

    List<Pirate> findByRaidsId(long id);



    //Above is using JPA to setup and write database queries for localhost paths with parameters using this and also Pirate Controller


    //below is SQL Query for find all pirates with a param/argument for last name
//    @Query(value = "SELECT * FROM PIRATES WHERE LAST_NAME = ?1", nativeQuery = true)
//    List<Pirate> findPiratesByLastNameNew(String lastName);



}