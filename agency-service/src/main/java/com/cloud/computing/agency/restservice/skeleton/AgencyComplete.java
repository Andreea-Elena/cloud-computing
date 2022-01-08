package com.cloud.computing.agency.restservice.skeleton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgencyComplete {

    private Long agencyId;
    private String agencyName;
    private String agencyDescription;
    private Long locationId;
    private String locationAddress;
    private Integer locationPostalCode;

}
