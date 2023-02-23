package com.example.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springcloud.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}
