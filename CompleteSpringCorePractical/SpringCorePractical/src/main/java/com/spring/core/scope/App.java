package com.spring.core.scope;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/scope/config.xml");
		SpringPrototypeScope object1 = (SpringPrototypeScope) context.getBean("SpringScope");
		System.out.println("Printing hashcode for object1: "+object1.hashCode());
		System.out.println(object1);
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/core/scope/config.xml");
		SpringPrototypeScope object = (SpringPrototypeScope) context.getBean("SpringScope");
		System.out.println("Printing hashcode for object: "+object.hashCode());
		System.out.println(object);
		
		
		SpringPrototypeScope object2 = (SpringPrototypeScope) context.getBean("SpringScope");
		System.out.println("Printing hashcode for object1: "+object2.hashCode());
		System.out.println(object2);
		
		SpringPrototypeScope object3 = (SpringPrototypeScope) context.getBean("SpringScope");
		System.out.println("Printing hashcode for object1: "+object2.hashCode());
		System.out.println(object3);
		
		SpringPrototypeScope object4 = (SpringPrototypeScope) context.getBean("SpringScope");
		System.out.println("Printing hashcode for object1: "+object2.hashCode());
		System.out.println(object4);
		
		SpringPrototypeScope object5 = (SpringPrototypeScope) context.getBean("SpringScope");
		System.out.println("Printing hashcode for object1: "+object2.hashCode());
		System.out.println(object5);
		
		SpringPrototypeScope object6 = (SpringPrototypeScope) context.getBean("SpringScope");
		System.out.println("Printing hashcode for object1: "+object2.hashCode());
		System.out.println(object6);
		
		//By scope of the spring bean will be singleton means it will create only 
		//one object at a time and how many time you will ask for new bean this will 
		//give you new object but it has created only one time called singleton 
		//scope of the spring bean.
		
		
	}
	
	
}
