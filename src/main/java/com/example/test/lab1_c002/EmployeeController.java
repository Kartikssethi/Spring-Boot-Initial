package com.example.test.lab1_c002;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private Employee employee;

    @GetMapping("/employee")
    public Employee getEmployee() {
        return employee;
    }
}
