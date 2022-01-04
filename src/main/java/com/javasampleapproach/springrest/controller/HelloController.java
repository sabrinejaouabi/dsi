package com.javasampleapproach.springrest.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

	@RequestMapping(value = "/")
	public String hello() {
		return "Hello World from Tomcat";
	}

}
