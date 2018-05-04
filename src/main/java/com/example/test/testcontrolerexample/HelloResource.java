package com.example.test.testcontrolerexample;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

@RestController
@RequestMapping("/hello")
public class HelloResource {

	@GetMapping
	public String getHelloWorld() {
		return "hello World!";
	}
	
	@GetMapping(value="/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public Hello json() {
		return new Hello("Start", "Hello");
	}
	
	
	
}
