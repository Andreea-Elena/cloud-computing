package com.cloud.computing.location.restservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping("/{id}")
    public Location findOneById(
            @PathVariable("id") Long locationId
    ) {
        log.info("(LocationController)(findOneById)");
        return locationService.findLocationById(locationId);
    }

    @PostMapping("/")
    public Location saveOne(
            @RequestBody Location location
    ) {
        log.info("(LocationController)(saveOne)");
        return locationService.saveLocation(location);
    }
}
