package com.amarjeet.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {
	
	@GetMapping("/sayHello")
	public String sayHello() {
		System.out.println("Hello Beta");
		return "Hi Beta Jee";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
