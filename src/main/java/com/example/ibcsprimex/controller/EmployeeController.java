package com.example.ibcsprimex.controller;

import com.example.ibcsprimex.model.Employee;
import com.example.ibcsprimex.service.EmployeeService;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public HttpEntity<Employee> add(@RequestBody Employee employee) {
        Employee employee1 = employeeService.save(employee);
        return new ResponseEntity<>(employee1, HttpStatus.OK);
    }
}
