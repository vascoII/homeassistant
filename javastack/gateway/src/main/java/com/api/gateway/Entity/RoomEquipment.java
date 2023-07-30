package com.api.gateway.Entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "room_equipment")
public class RoomEquipment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
    private Room room;

    @ManyToOne
    @JoinColumn(name = "equipment_id", nullable = false)
    private Equipment equipment;

    private String equipment_desc;

    @Column(nullable = false)
    private Timestamp created_at;

    @Column
    private Timestamp updated_at;

    // Constructors
    public RoomEquipment() {
        // Default constructor
    }

    public RoomEquipment(Room room, Equipment equipment, String equipment_desc) {
        this.room = room;
        this.equipment = equipment;
        this.equipment_desc = equipment_desc;
        this.created_at = new Timestamp(System.currentTimeMillis());
    }

    // toString method
    @Override
    public String toString() {
        return "RoomEquipment{" +
                "id=" + id +
                ", room=" + room +
                ", equipment=" + equipment +
                ", equipment_desc='" + equipment_desc + '\'' +
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

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public String getEquipment_desc() {
        return equipment_desc;
    }

    public void setEquipment_desc(String equipment_desc) {
        this.equipment_desc = equipment_desc;
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
