package com.cloud.computing.employee.restservice;

import com.cloud.computing.employee.restservice.skeleton.Agency;
import com.cloud.computing.employee.restservice.skeleton.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseTemplate getEmployeeAndAgency(Long employeeId) {
        log.info("(EmployeeService)(getEmployeeAndAgency)");
        ResponseTemplate responseTemplate = new ResponseTemplate();

        Employee employee = employeeRepository.findByEmployeeId(employeeId);
        responseTemplate.setEmployee(employee);

        Agency agency = restTemplate.getForObject("http://AGENCY-SERVICE/agencies/complete/" + employee.getAgencyId(), Agency.class);
        responseTemplate.setAgency(agency);

        return responseTemplate;
    }

    public Employee saveEmployee(Employee employee) {
        log.info("(EmployeeService)(saveEmployee)");
        return employeeRepository.save(employee);
    }

}
