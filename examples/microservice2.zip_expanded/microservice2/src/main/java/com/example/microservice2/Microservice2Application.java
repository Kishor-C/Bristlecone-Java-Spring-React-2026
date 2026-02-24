package com.example.microservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Microservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
	}

	/*
	 * Object that should be registred in the spring container
	 */
	@LoadBalanced
	@Bean
	public RestTemplate createRest() {
		return new RestTemplate();
	}
}
