package com.gianneves.parkingcontrol.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    final ParkingSpotController parkingSpotController;

    public ParkingSpotController(ParkingSpotController parkingSpotController) {
        this.parkingSpotController = parkingSpotController;
    }


}
