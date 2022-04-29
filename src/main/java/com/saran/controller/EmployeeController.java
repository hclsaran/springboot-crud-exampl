package com.saran.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.saran.entity.Department;
import com.saran.entity.Employee;
import com.saran.entity.Gender;
import com.saran.service.EmployeeService;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;


@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping()
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @RequestMapping(method = GET,path = "/str")
    public String getEmployeesString() {
        return "Hello";
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        Employee emp = employeeService.getEmployeeById(id);
        return emp;
    }

//    @GetMapping("/{empid}")
//    public Employee getEmployee(@PathVariable("empid") Integer id) {
//        Employee emp = employeeService.getEmployeeById(id);
//        return emp;
//    }

    @ResponseStatus(HttpStatus.CREATED) // send HTTP 201 instead of 200 as new object created
    @PostMapping
   // @RequestMapping(method=POST)
    public Employee createEmployee(@RequestBody Employee employee) {

        return employeeService.createEmployee(employee);
    }

    @PutMapping()
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping(value="/{id}")
    public  void deletePost(@PathVariable("id") Integer id){
        employeeService.deleteEmployee(id);
    }

    @PatchMapping("/{empId}/dept/{deptId}")
    public Employee updateEmpDepartment(@PathVariable("empId") Integer emp_id , @PathVariable("deptId") Integer dept_id) {
       return employeeService.updateEmpDepartment(emp_id,dept_id);
    }

    @PatchMapping("/{empId}")
    public Employee updateEmpDepartmentbYId(@PathVariable("empId") Integer emp_id , @RequestBody Department department) {
        return employeeService.updateEmpDepartment(emp_id,department.getId());
    }

    @GetMapping(value="/gender/{gender}")
    public List<Employee> getEmployeesByGender(@PathVariable String gender) {

        return employeeService.findEmployeesByGender(Gender.valueOf(gender));
    }

    @GetMapping(value="/gender2/{gender}")
    public List<Employee> searchEmployeesByGender(@PathVariable String gender) {

        return employeeService.searchEmployeesByGender(Gender.valueOf(gender));
    }

}

