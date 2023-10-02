package com.geekster.employeeAddress.service;

import com.geekster.employeeAddress.model.Employee;
import com.geekster.employeeAddress.repo.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;

    public String saveEmployee(Employee newEmployee) {
        employeeRepo.save(newEmployee);
        return "employee added";
    }

    public List<Employee> getEmployee() {
        return employeeRepo.findAll();
    }

    public String removeEmployee(Long id) {
        employeeRepo.deleteById(id);
        return "employee removed";
    }

    public Employee getEmployeeById(Long id) {
        return employeeRepo.findById(id).orElseThrow();
    }
}
