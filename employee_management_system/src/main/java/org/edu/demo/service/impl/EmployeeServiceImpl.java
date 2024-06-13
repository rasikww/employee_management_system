package org.edu.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.edu.demo.dto.Employee;
import org.edu.demo.entity.EmployeeEntity;
import org.edu.demo.repository.EmployeeRepository;
import org.edu.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeRepository repository;
    @Override
    public void addEmployee(Employee employee) {
        repository.save(new ObjectMapper().convertValue(employee, EmployeeEntity.class));
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return repository.findAll();
    }
}
