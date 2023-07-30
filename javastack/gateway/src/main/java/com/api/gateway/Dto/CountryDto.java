package com.api.gateway.Dto;

import com.api.gateway.Entity.Country;

public class CountryDto {

    private Long id;
    private String name;
    private String ref;

    // Constructors
    public CountryDto() {
        // Default constructor
    }

    public CountryDto(Long id, String name, String ref) {
        this.id = id;
        this.name = name;
        this.ref = ref;
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

    public String getRef() {
        return ref;
    }
  
    public void setRef(String ref) {
        this.ref = ref;
    }

    public Country toEntity() {
        Country country = new Country();
        country.setId(this.id);
        country.setRef(this.ref);

        return country;
    }
    
}
