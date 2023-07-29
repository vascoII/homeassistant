package com.api.gateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gateway.Entity.Equipment;

interface EquipmentRepository extends JpaRepository<Equipment, Long> {

}
