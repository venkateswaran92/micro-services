package com.venkat.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venkat.microservices.bean.LimitConfiguration;
import com.venkat.microservices.configuration.Configuration;

@RestController
public class LimitConfigurationController {

	@Autowired
	private Configuration Configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retriveLimtConfiguration() {
		return new LimitConfiguration(Configuration.getMaximim(),Configuration.getMinimum());
	}
}
