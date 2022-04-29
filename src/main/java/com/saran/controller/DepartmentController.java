package com.saran.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saran.entity.Department;
import com.saran.service.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(value="/{id}")
    public Department getDepartmentById(@PathVariable Integer id) {
        Department dept = departmentService.getDepartmentById(id);
        return dept;
    }

    @GetMapping
    public List<Department> getDepartments() {
        return departmentService.getAllDepartments();
    }
}