package com.api.gateway.Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "sensor")
public class Sensor implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "reference_sensor_id", nullable = false)
    private ReferenceSensor referenceSensor;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    // Constructors
    public Sensor() {
        // Default constructor
    }

    public Sensor(ReferenceSensor referenceSensor, String name, Timestamp created_at) {
        this.referenceSensor = referenceSensor;
        this.name = name;
        this.created_at = created_at;
    }

    // Getters and Setters

    // toString method
    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", referenceSensor=" + referenceSensor +
                ", name='" + name + '\'' +
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

    public ReferenceSensor getReferenceSensor() {
        return referenceSensor;
    }

    public void setReferenceSensor(ReferenceSensor referenceSensor) {
        this.referenceSensor = referenceSensor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
