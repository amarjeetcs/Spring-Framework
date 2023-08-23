package com.mypackage;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Component
public class Dog {

	public void getDogName() {
		System.out.println("Lalu Yadav");
	}

}
