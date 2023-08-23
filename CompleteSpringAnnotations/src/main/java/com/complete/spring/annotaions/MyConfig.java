package com.complete.spring.annotaions;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@ComponentScan(basePackages = {"com.mypackage"})
public class MyConfig {
	
	@Bean("student1")
	@Lazy
	@Primary
	public Studnet getStudent1()
	{
		System.out.println("creating student one object");
		return new Studnet("student one");
	}
	
	@Bean("student2")
	@Lazy
	public Studnet getStuden2()
	{
		System.out.println("creating student two object");
		return new Studnet("student two");
	}
	
	@Bean
	public void getCollge()
	{
		System.out.println("I am from Ies college Bhopal");
	}
	
	@Bean
	public Date getDate()
	{
		System.out.println("creating date object");
		return new Date();
	}
	
	

}
