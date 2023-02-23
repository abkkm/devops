package com.example.springcloud.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springcloud.model.Flight;
import com.example.springcloud.repos.FlightRepository;

@RestController
public class FlightController {

	@Autowired
	FlightRepository repo;

	@GetMapping("/flights")
	public List<Flight> getFlights() {
		return repo.findAll();

	}

}
