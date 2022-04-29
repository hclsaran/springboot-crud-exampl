package com.saran.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.saran.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
