package com.example.ibcsprimex.service.impl;

import com.example.ibcsprimex.model.Employee;
import com.example.ibcsprimex.repository.EmployeeRepository;
import com.example.ibcsprimex.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee entity) {
        return employeeRepository.save(entity);
    }
}
