package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Car;
import com.example.demo.models.Driver;
import com.example.demo.repo.CarRepository;
import com.example.demo.repo.DriverRepository;

@SpringBootApplication
public class SoJpaTestApplication implements CommandLineRunner {
	
	@Autowired
    CarRepository _carRepo;

    @Autowired
    DriverRepository _driverRepo;
    
	public static void main(String[] args) {
		SpringApplication.run(SoJpaTestApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Driver driver = new Driver();
		_driverRepo.save(driver);
		
		Car car = new Car();
		_carRepo.save(car);

		Car car2 = new Car();
		_carRepo.save(car2);
		
		driver.setCar(car);
		
		_driverRepo.save(driver);
	}

}
