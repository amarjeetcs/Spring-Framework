package com.complete.spring.annotaions;

import java.util.Date;

import javax.management.loading.PrivateClassLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import com.mypackage.Dog;

@SpringBootApplication

public class CompleteSpringAnnotationsApplication implements CommandLineRunner {
	@Autowired
	// @Qualifier("student2")
	private Studnet studnet;

	@Autowired
	private Date date;

	@Autowired
	private Emp emp;

	@Autowired
	private Dog dog;

	public static void main(String[] args) {

		SpringApplication.run(CompleteSpringAnnotationsApplication.class, args);
		System.out.println("Hell Beta");

	}

	@Override
	public void run(String... args) throws Exception {
		this.studnet.studying();
		this.emp.whatIsYourName();
		this.dog.getDogName();

	}

}
