package com.spring.core.Lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifecycleUsingDisposableBeanAnadInitilizingBean implements InitializingBean, DisposableBean{
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LifecycleUsingDisposableBeanAnadInitilizingBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("taking pepsi....");
		
	}

	public void destroy() throws Exception {
		System.out.println("destroing pepsi....");
		
	}
	
	
	
	

}
