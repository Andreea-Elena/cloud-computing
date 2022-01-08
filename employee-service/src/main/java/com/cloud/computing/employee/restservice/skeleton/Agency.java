package com.cloud.computing.employee.restservice.skeleton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agency {

    private Long agencyId;
    private String agencyName;
    private String agencyDescription;
    private Long locationId;
    private String locationAddress;
    private Integer locationPostalCode;

}
