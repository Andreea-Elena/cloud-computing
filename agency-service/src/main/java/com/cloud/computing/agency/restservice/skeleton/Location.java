package com.cloud.computing.agency.restservice.skeleton;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private Long locationId;
    private String locationAddress;
    private Integer locationPostalCode;

}
