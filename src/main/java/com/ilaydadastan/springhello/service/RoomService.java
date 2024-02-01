package com.ilaydadastan.springhello.service;

import com.ilaydadastan.springhello.model.Room;
import com.ilaydadastan.springhello.repository.RoomRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    private final RoomRepository roomRepository;

    public RoomService(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    public List<Room> getRooms() {
        return roomRepository.findAll();
    }

    public Room getById(long id){
        return roomRepository.findById(id).get();
    }
}
