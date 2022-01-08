package com.cloud.computing.employee.restservice.skeleton;

import com.cloud.computing.employee.restservice.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplate {

    private Employee employee;
    private Agency agency;
}
