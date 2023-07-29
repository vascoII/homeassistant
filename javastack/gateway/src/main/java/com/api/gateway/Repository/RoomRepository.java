package com.api.gateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.gateway.Entity.Room;

interface RoomRepository extends JpaRepository<Room, Long> {

}
