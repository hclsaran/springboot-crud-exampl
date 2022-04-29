package com.saran.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saran.entity.Department;
import com.saran.repository.DepartmentRepository;
import com.saran.repository.EmployeeRepository;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(Integer id) {
        return departmentRepository.getById(id);
    }
}
