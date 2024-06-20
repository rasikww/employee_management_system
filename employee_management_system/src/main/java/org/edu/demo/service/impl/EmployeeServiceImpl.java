package org.edu.demo.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.edu.demo.dto.Employee;
import org.edu.demo.entity.EmployeeEntity;
import org.edu.demo.repository.EmployeeRepository;
import org.edu.demo.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeRepository repository;
    @Override
    public void addEmployee(Employee employee) {
        repository.save(new ObjectMapper().convertValue(employee, EmployeeEntity.class));
    }

    @Override
    public List<Employee> getAll() {
        List<Employee> employeeList = new ArrayList<>();
        List<EmployeeEntity> allEntityList = repository.findAll();
        allEntityList.forEach(entity -> {
            Employee employee = new ObjectMapper().convertValue(entity, Employee.class);
            employeeList.add(employee);
        });
        return employeeList;
    }

    @Override
    public void deleteEmployeeById(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }

    @Override
    public void updateEmployee(Employee employee) {
        if (repository.findById(employee.getId()).isPresent()){
            repository.save(
                    new ObjectMapper()
                            .convertValue(employee, EmployeeEntity.class)
            );
        }
    }

    @Override
    public Employee findById(Long id) {
        if (repository.findById(id).isPresent()){
            Optional<EmployeeEntity> byId = repository.findById(id);
            return new ObjectMapper().convertValue(byId.get(), Employee.class);
        }
        return new Employee();
    }

    @Override
    public Employee findByFirstName(String firstName) {
        return new ObjectMapper()
                .convertValue(
                        repository.findByFirstName(firstName),
                        Employee.class);
    }
}
