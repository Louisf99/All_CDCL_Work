package com.codeclan.example.EmployeeData_Lab.Model;

import javax.persistence.*;

@Entity
@Table(name="employee")

public class Employee {
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "age")
    private int age;

    @Column(name = "employee_number", unique = true)
    private int employeeNumber;

    @Column(name = "email")
    private String email;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    public Employee() {
    }

    public Employee(String firstName, int age, int employeeNumber, String email) {
        this.firstName = firstName;
        this.age = age;
        this.employeeNumber = employeeNumber;
        this.email = email;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    //    name, age, employeeNumber and email

}
