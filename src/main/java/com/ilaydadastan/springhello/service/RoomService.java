package com.ilaydadastan.springhello.service;

import com.ilaydadastan.springhello.model.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private static final List<Room> rooms = new ArrayList<>();

    static {
        for (int i = 0; i < 10; i++) {
            rooms.add(new Room(i, "room " + i, "r" + i, "double"));
        }
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
