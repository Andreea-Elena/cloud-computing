package com.cloud.computing.agency.restservice;

import com.cloud.computing.agency.restservice.skeleton.AgencyComplete;
import com.cloud.computing.agency.restservice.skeleton.Location;
import com.cloud.computing.agency.restservice.skeleton.ResponseTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class AgencyService {

    @Autowired
    private AgencyRepository agencyRepository;

    @Autowired
    private RestTemplate restTemplate;

    public ResponseTemplate findAgencyAndLocation(Long agencyId) {
        log.info("(AgencyService)(findAgencyAndLocation)");
        ResponseTemplate responseTemplate = new ResponseTemplate();

        Agency agency = agencyRepository.findByAgencyId(agencyId);
        responseTemplate.setAgency(agency);

        Location location = restTemplate.getForObject("http://LOCATION-SERVICE/locations/" + agency.getLocationId(), Location.class);
        responseTemplate.setLocation(location);

        return responseTemplate;
    }

    public Agency saveAgency(Agency agency) {
        log.info("(AgencyService)(saveAgency)");
        return agencyRepository.save(agency);
    }

    public AgencyComplete findAgencyComplete(Long agencyId) {
        log.info("(AgencyService)(findAgencyComplete)");
        ResponseTemplate responseTemplate = new ResponseTemplate();

        Agency agency = agencyRepository.findByAgencyId(agencyId);
        responseTemplate.setAgency(agency);

        Location location = restTemplate.getForObject("http://LOCATION-SERVICE/locations/" + agency.getLocationId(), Location.class);
        responseTemplate.setLocation(location);

        AgencyComplete agencyComplete = new AgencyComplete(
                agency.getAgencyId(), agency.getAgencyName(), agency.getAgencyDescription(),
                agency.getLocationId(), location.getLocationAddress(), location.getLocationPostalCode());

        return agencyComplete;
    }
}
