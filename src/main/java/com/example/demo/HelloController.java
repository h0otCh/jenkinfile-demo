package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "hello/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Hello> greeting(@PathVariable String name) {
		Hello hello = new Hello();
		hello.setRidiculous(name);
		return new ResponseEntity<>(hello, HttpStatus.OK);
	}
}
