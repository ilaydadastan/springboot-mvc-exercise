package com.ilaydadastan.springhello.repository;

import com.ilaydadastan.springhello.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {

}
