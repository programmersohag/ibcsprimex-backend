package com.example.ibcsprimex.repository;

import com.example.ibcsprimex.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
