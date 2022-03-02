package com.codeclan.example.EmployeeData_Lab.Repository;

import com.codeclan.example.EmployeeData_Lab.Model.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    Optional<Employee> findByEmail(String email);
}
