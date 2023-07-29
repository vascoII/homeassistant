package com.api.gateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gateway.Entity.RoomEquipment;

interface RoomEquipmentRepository extends JpaRepository<RoomEquipment, Long> {

}

