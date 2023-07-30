package com.api.gateway.Dto;

public class IndicatorDto {

    private Long id;
    private String value;

    // Constructors
    public IndicatorDto() {
        // Default constructor
    }

    public IndicatorDto(Long id, String value) {
        this.id = id;
        this.value = value;
    }

    public Long getId() {
        return id;
    }
  
    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }
  
    public void setValueId(String value) {
        this.value = value;
    }

}
