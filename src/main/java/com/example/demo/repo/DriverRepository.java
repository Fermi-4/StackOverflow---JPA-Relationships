package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long>{

}
