package com.codeclan.example.pirateservice.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "raids")
public class Raid {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "location")
    private String location;

    @Column(name = "loot")
    private int loot;

    @ManyToMany
    @JsonIgnoreProperties({"raids"})
    @JsonBackReference
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "pirates_raids",
            joinColumns = {@JoinColumn(
                    name = "raid_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = {@JoinColumn(
                    name = "pirate_id",
                    nullable = false,
                    updatable = false)
            })
    private List<Pirate> pirates;

    public Raid(String location, int loot) {
        this.location = location;
        this.loot = loot;
        this.pirates = new ArrayList<>();
    }

    public Raid() {
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getLoot() {
        return loot;
    }

    public void setLoot(int loot) {
        this.loot = loot;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addPirate(Pirate pirate) {
        this.pirates.add(pirate);
    }


}

