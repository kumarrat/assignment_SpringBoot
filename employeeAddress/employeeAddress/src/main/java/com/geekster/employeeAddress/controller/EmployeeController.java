package com.geekster.employeeAddress.controller;

import com.geekster.employeeAddress.model.Address;
import com.geekster.employeeAddress.model.Employee;
import com.geekster.employeeAddress.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("employee")
    public String addEmployee(@RequestBody Employee newEmployee)
    {
        return employeeService.saveEmployee(newEmployee);
    }

    @GetMapping("Employee")
    public List<Employee> getEmployee()
    {
        return employeeService.getEmployee();
    }

    @DeleteMapping("employee/{id}")
    public String removeEmployee(@PathVariable Long id)
    {
        return employeeService.removeEmployee(id);
    }

    @GetMapping("employee/{id}/id")
    public Employee getEmployeeById(@PathVariable Long id)
    {
        return employeeService.getEmployeeById(id);
    }

}
