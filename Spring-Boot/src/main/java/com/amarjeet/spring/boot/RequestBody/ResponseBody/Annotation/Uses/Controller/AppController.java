package com.amarjeet.spring.boot.RequestBody.ResponseBody.Annotation.Uses.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppController {

	@Autowired
	private Student student;
	// if we put restcontroller then no need to add responsebody and controller
	// RestControoler= controller+responseBody
	@GetMapping("/responseBodyDemo")
	@ResponseBody
	public String responseBodyDemo1() {
		System.out.println("This is responseBody practical");
		return "This is responseBody pratical";
	}
	
	@GetMapping("/getMap")
	@ResponseBody
	Map<Integer,String> getMap()
	{
		return Map.of(101,"Amarjeet");
	}
	
	

}
