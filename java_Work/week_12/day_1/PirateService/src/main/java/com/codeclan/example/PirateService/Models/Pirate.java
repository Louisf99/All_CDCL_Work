package com.codeclan.example.PirateService.Models;

import javax.persistence.*;

@Entity
@Table(name="pirates",
        uniqueConstraints={@UniqueConstraint(columnNames ={"first_name","last_name"})})


public class Pirate {
    @Column(name = "first_name")
   private String firstName;

    @Column(name = "last_name")
   private String lastName;

    @Column(name = "age")
   private int age;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private long Id;

    public Pirate(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pirate() {

    }

    public long getId() {
        return Id;
    }
}
