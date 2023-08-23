package com.amarjeet.spring.boot.Autowired.Qualifier.Primary.Annotation.Uses;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class Cat implements Animal{

	@Override
	public String getCharactristics() {
		System.out.println("I am Cat");
		return "meow meow";
	}

}
