package com.example.microservice3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MS3Controller {

	@Value("${message}")
	private String msg;
	
	
	@GetMapping
	public String getMessage() {
		return msg;
	}
}
