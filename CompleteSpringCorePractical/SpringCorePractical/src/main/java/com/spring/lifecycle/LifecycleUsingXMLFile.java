package com.spring.lifecycle;

public class LifecycleUsingXMLFile {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Injecting price before calling init method");
		this.price = price;
	}

	public LifecycleUsingXMLFile() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init()
	{
		System.out.println("inside the init method of samosa...");
	}
	
	public void destroy()
	{
		System.out.println("inside the destroy method of samosa...");
	}
}
