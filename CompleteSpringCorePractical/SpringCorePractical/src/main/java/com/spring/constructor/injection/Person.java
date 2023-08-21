package com.spring.constructor.injection;

public class Person {
	private int personId;
	private String personName;
	
	public Person(int personId, String personName)
	{
		this.personId=personId;
		this.personName=personName;
	}
	
	public Person(String personName, int personId)
	{
		this.personId=personId;
		this.personName=personName;
	}


	@Override
	public String toString() {
		
		return this.personId+" : "+this.personName;
	}
	
	

}
