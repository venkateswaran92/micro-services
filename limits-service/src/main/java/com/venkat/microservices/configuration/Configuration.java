package com.venkat.microservices.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limits-service")
public class Configuration {

	private int minimum; 
	private int maximim;

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximim() {
		return maximim;
	}

	public void setMaximim(int maximim) {
		this.maximim = maximim;
	};

}
