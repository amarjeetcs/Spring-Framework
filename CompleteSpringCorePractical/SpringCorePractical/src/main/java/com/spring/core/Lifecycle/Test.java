package com.spring.core.Lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/core/Lifecycle/lifecycleconfig.xml");
		Samosa s = (Samosa) context.getBean("s1");
		System.out.println(s);
		context.registerShutdownHook();// this method will run the destroy object

		System.out.println("++++++++++++++++++++++++++++++++");
		Pepsi p = (Pepsi) context.getBean("p1");
		System.out.println(p);

		System.out.println("+++++++++++++++++++++++++++");
		context.registerShutdownHook();
		Example e = (Example) context.getBean("e1");
		System.out.println(e);

	}

}
