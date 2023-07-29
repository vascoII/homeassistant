package com.api.gateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gateway.Entity.Country;

interface CountryRepository extends JpaRepository<Country, Long> {

}

