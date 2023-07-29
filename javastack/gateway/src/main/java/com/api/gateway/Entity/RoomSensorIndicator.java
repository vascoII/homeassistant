package com.api.gateway.Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "room_sensor_indicator")
public class RoomSensorIndicator implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "reference_sensor_id", nullable = false)
    private ReferenceSensor referenceSensor;

    @ManyToOne
    @JoinColumn(name = "indicator_id", nullable = false)
    private Indicator indicator;

    @Column(nullable = false)
    private String value;

    @Column(nullable = false)
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    // Constructors
    public RoomSensorIndicator() {
        // Default constructor
    }

    public RoomSensorIndicator(Room room, ReferenceSensor referenceSensor, Indicator indicator, String value, Timestamp created_at) {
        this.room = room;
        this.referenceSensor = referenceSensor;
        this.indicator = indicator;
        this.value = value;
        this.created_at = created_at;
    }

    // Getters and Setters

    // toString method
    @Override
    public String toString() {
        return "RoomSensorIndicator{" +
                "id=" + id +
                ", room=" + room +
                ", referenceSensor=" + referenceSensor +
                ", indicator=" + indicator +
                ", value='" + value + '\'' +
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

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public ReferenceSensor getReferenceSensor() {
        return referenceSensor;
    }

    public void setReferenceSensor(ReferenceSensor referenceSensor) {
        this.referenceSensor = referenceSensor;
    }

    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
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
