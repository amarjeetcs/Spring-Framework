package com.amarjeet.spring.boot.Autowired.Qualifier.Primary.Annotation.Uses;

import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal{

	@Override
	public String getCharactristics() {
		System.out.println("I am Dog");
		return "Barking";
	}
	

}
