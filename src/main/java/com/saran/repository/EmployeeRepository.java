package com.saran.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.saran.entity.Employee;
import com.saran.entity.Gender;

import java.util.List;

public interface  EmployeeRepository extends JpaRepository<Employee,Integer> {
    //custom methods
    public List<Employee> findByGender(Gender gender);

    @Query("select e from Employee e where e.gender = 'M'")
    public  List<Employee> searchByGender(Gender gender);
}
