package com.cloud.computing.location.restservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public Location findLocationById(Long locationId) {
        log.info("(LocationService)(findAgencyById)");
        return locationRepository.findByLocationId(locationId);
    }

    public Location saveLocation(Location location) {
        log.info("(LocationService)(saveAgency)");
        return locationRepository.save(location);
    }

}
