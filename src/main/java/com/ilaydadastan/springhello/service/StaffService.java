package com.ilaydadastan.springhello.service;

import com.ilaydadastan.springhello.model.Staff;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<Staff> staffList = new ArrayList<>();

    static {
        for (int i = 0; i < 5; i++) {
            staffList.add(new Staff(UUID.randomUUID(), "name " + i, "lastName " + i, "position " + i));
        }
    }

    public List<Staff> getStaffList() {
        return staffList;
    }
}
