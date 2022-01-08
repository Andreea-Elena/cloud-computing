package com.cloud.computing.employee.restservice;

import com.cloud.computing.employee.restservice.skeleton.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/{id}")
    public ResponseTemplate getEmployeeAndDepartment(
            @PathVariable("id") Long employeeId
    ) {
        log.info("(EmployeeController)(getEmployeeAndDepartment)");
        return employeeService.getEmployeeAndAgency(employeeId);
    }

    @PostMapping("/")
    public Employee saveOne(
            @RequestBody Employee employee
    ) {
        log.info("(EmployeeController)(saveOne)");
        return employeeService.saveEmployee(employee);
    }
}
