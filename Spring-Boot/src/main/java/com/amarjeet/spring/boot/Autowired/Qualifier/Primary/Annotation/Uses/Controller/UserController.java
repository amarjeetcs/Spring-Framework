package com.amarjeet.spring.boot.Autowired.Qualifier.Primary.Annotation.Uses.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amarjeet.spring.boot.Autowired.Qualifier.Primary.Annotation.Uses.Animal;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	//@Qualifier("dog")
	private Animal animal;
	
	@GetMapping("/getAnimal")
	public String getAnimalCharactristics()
	{
		return animal.getCharactristics();
	}
	@GetMapping("/GetMapData")
	public Map<Integer,String> map()
	{
		return Map.of(101,"Amarjeet");
	}
	
	
	
}
