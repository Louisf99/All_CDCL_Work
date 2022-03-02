package com.codeclan.example.EmployeeData_Lab;

import com.codeclan.example.EmployeeData_Lab.Model.Employee;
import com.codeclan.example.EmployeeData_Lab.*;
import com.codeclan.example.EmployeeData_Lab.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

@RunWith(SpringRunner.class)
@SpringBootTest
class EmployeeDataLabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployees(){
		Employee louis = new Employee("Louis",22, 123,"Louisco1999@gmail,com");
		employeeRepository.save(louis);
	}

}


