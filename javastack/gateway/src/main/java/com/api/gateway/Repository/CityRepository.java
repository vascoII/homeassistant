package com.api.gateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gateway.Entity.City;

interface CityRepository extends JpaRepository<City, Long> {

}

