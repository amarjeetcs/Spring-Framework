package com.amarjeet.spring.boot.Controller2;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/GetMapData")
	public Map<Integer,String> map()
	{
		return Map.of(101,"Amarjeet");
	}
}
