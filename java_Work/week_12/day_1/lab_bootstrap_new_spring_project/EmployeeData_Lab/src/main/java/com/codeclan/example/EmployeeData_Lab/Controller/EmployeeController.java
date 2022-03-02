package com.codeclan.example.EmployeeData_Lab.Controller;

import com.codeclan.example.EmployeeData_Lab.Model.Employee;
import com.codeclan.example.EmployeeData_Lab.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/employee")
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/employee/firstname")
    public Optional<Employee> getEmployeeByName(@PathVariable String firstname) {
        return null;
    }

    @GetMapping(value = "/employee/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {
        return employeeRepository.findById(id);
    }

    @GetMapping(value = "/employee/{email}")
    public Optional<Employee> getEmployeeEmail(@PathVariable String email){
        return employeeRepository.findByEmail(email);
    }
}

