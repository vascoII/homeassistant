package com.api.gateway.Dto;

import java.util.ArrayList;

public class RoomDto {

    private Long id;
    private String description;
    private ArrayList<EquipmentDto> equipments;
    private ArrayList<SensorDto> sensors;

    // Constructors
    public RoomDto() {
        // Default constructor
    }

    public RoomDto(Long id, String description, ArrayList<EquipmentDto> equipments, ArrayList<SensorDto> sensors) {
        this.id = id;
        this.description = description;
        this.equipments = equipments;
        this.sensors= sensors;
    }

    public Long getId() {
        return id;
    }
  
    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return description;
    }
  
    public void setDesc(String description) {
        this.description = description;
    }

    public ArrayList<EquipmentDto> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<EquipmentDto> equipments) {
        this.equipments = equipments;
    }

    public ArrayList<SensorDto> getSensors() {
        return sensors;
    }
  
    public void setSensors(ArrayList<SensorDto> sensors) {
        this.sensors = sensors;
    }
      
}
