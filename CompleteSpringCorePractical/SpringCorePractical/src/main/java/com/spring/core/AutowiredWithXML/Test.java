package com.spring.core.AutowiredWithXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/AutowiredWithXML/autoconfig.xml");
		Address ad=(Address) context.getBean("IloveYouSanjeet");
		System.out.println(ad);
		//this is spring container
		//Emp emp=(Emp) context.getBean("emp1");
		//System.out.println(emp);
		
	}

}
