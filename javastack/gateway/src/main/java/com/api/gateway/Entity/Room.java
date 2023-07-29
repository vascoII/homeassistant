package com.api.gateway.Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "room")
public class Room implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "reference_room_id", nullable = false)
    private ReferenceRoom referenceRoom;

    @ManyToOne
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @Column(nullable = false)
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    // Constructors
    public Room() {
        // Default constructor
    }

    public Room(String name, ReferenceRoom referenceRoom, City city) {
        this.name = name;
        this.referenceRoom = referenceRoom;
        this.city = city;
    }

    // Getters and Setters

    // toString method
    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", referenceRoom=" + referenceRoom +
                ", city=" + city +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReferenceRoom getReferenceRoom() {
        return referenceRoom;
    }

    public void setReferenceRoom(ReferenceRoom referenceRoom) {
        this.referenceRoom = referenceRoom;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
