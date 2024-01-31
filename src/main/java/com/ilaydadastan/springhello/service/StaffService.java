package com.ilaydadastan.springhello.service;

import com.ilaydadastan.springhello.model.Staff;
import com.ilaydadastan.springhello.repository.StaffRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffService {

    private final StaffRepository staffRepository;

    public StaffService(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> getStaffList() {
        return staffRepository.findAll();
    }
}
