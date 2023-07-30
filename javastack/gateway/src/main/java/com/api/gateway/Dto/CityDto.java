package com.api.gateway.Dto;

import com.api.gateway.Entity.City;
import com.api.gateway.Entity.Country;

public class CityDto {

    private Long id;
    private String name;
    private CountryDto country;

    // Constructors
    public CityDto() {
        // Default constructor
    }

    public CityDto(Long id, String name, CountryDto country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public CountryDto getCountry() {
        return country;
    }
  
    public void setCountry(CountryDto country) {
        this.country = country;
    }

    public City toEntity() {
        Country country = this.country.toEntity();

        City city = new City();
        city.setId(id);
        city.setName(name);
        city.setCountry(country);
        
        return city;
    }
    
}
