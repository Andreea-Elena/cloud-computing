package com.cloud.computing.agency.restservice;

import com.cloud.computing.agency.restservice.skeleton.AgencyComplete;
import com.cloud.computing.agency.restservice.skeleton.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/agencies")
public class AgencyController {

    @Autowired
    private AgencyService agencyService;

    @GetMapping("/{id}")
    public ResponseTemplate findAgencyAndLocation(
            @PathVariable("id") Long agencyId
    ) {
        log.info("(AgencyController)(findAgencyAndLocation)");
        return agencyService.findAgencyAndLocation(agencyId);
    }

    @GetMapping("/complete/{id}")
    public AgencyComplete findAgencyComplete(
            @PathVariable("id") Long agencyId
    ) {
        log.info("(AgencyController)(findAgencyComplete)");
        return agencyService.findAgencyComplete(agencyId);
    }

    @PostMapping("/")
    public Agency saveOne(
            @RequestBody Agency agency
    ) {
        log.info("(AgencyController)(saveOne)");
        return agencyService.saveAgency(agency);
    }
}
