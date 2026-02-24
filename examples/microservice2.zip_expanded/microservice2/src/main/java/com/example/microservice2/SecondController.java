package com.example.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/v2")
public class SecondController {

	@Autowired
	private RestTemplate rest;
	
	@GetMapping
	public ResponseEntity<Object> invokeFirstMS() {
		String result = rest.getForObject("http://FIRST-MS/api/v1", String.class);
		return ResponseEntity.status(200).body(result);
	}
}
