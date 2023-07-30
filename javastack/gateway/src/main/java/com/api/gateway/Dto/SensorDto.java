package com.api.gateway.Dto;

import java.util.ArrayList;

public class SensorDto {

    private Long id;
    private ArrayList<IndicatorDto> indicators;

    // Constructors
    public SensorDto() {
        // Default constructor
    }

    public SensorDto(Long id, ArrayList<IndicatorDto> indicators) {
        this.id = id;
        this.indicators = indicators;
    }

    public Long getId() {
        return id;
    }
  
    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<IndicatorDto> getIndicators() {
        return indicators;
    }
  
    public void setIndicators(ArrayList<IndicatorDto> indicators) {
        this.indicators = indicators;
    }

}
