package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Car;
import com.example.demo.models.Driver;
import com.example.demo.repo.CarRepository;
import com.example.demo.repo.DriverRepository;

@RequestMapping("/api")
@RestController
public class DriverController {
	
	@Autowired
    CarRepository _carRepo;

    @Autowired
    DriverRepository _driverRepo;

    @PostMapping("/assigncar")
    public Driver assignCarToDriver(@RequestParam Long driverId,@RequestParam Long carId) {
         Car car = _carRepo.findById(carId).get();
         Driver driver = _driverRepo.findById(driverId).get();
         driver.setCar(car);
         return _driverRepo.save(driver);
    }
	
}
