package com.venkat.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Spring_cloud_config_server_Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring_cloud_config_server_Application.class, args);
	}
}
