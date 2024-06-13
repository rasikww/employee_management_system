package org.edu.demo.employeeController;

import lombok.RequiredArgsConstructor;
import org.edu.demo.dto.Employee;
import org.edu.demo.entity.EmployeeEntity;
import org.edu.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService service;

    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee){
        service.addEmployee(employee);
    }

    @GetMapping("get-all")
    public List<EmployeeEntity> getAll(){
        return service.getAll();
    }
}
