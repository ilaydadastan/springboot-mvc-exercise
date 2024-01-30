package com.ilaydadastan.springhello.controller;

import com.ilaydadastan.springhello.model.Staff;
import com.ilaydadastan.springhello.service.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staffs")
public class StaffRestController {
    public final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> staffList() {
        return staffService.getStaffList();
    }
}
