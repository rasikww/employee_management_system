package org.edu.demo.service;

import org.edu.demo.dto.Employee;
import org.edu.demo.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);
    List<EmployeeEntity> getAll();
}
