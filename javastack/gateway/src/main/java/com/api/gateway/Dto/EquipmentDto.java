package com.api.gateway.Dto;

import java.util.ArrayList;

public class EquipmentDto {

    private Long id;
    private ArrayList<SensorDto> sensors;

    // Constructors
    public EquipmentDto() {
        // Default constructor
    }

    public EquipmentDto(Long id, String name, ArrayList<SensorDto> sensors) {
        this.id = id;
        this.sensors = sensors;
    }

    public Long getId() {
        return id;
    }
  
    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<SensorDto> getSensors() {
        return sensors;
    }
  
    public void setSensors(ArrayList<SensorDto> sensors) {
        this.sensors = sensors;
    }

}
