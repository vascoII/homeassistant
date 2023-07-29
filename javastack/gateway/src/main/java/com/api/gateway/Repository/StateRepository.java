package com.api.gateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gateway.Entity.State;

interface StateRepository extends JpaRepository<State, Long> {

}
