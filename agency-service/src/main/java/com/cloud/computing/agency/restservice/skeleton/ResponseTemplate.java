package com.cloud.computing.agency.restservice.skeleton;

import com.cloud.computing.agency.restservice.Agency;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplate {

    private Agency agency;
    private Location location;

}
