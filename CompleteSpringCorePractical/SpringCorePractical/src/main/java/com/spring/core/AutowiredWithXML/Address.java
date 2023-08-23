package com.spring.core.AutowiredWithXML;

public class Address {
	private int Id;
	private String Name;
	private String City;
	private String Company;
	private double Salary;

	public int getId() {
		return Id;//
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public Address(int id, String name, String city, String company, double salary) {
		super();
		Id = id;
		Name = name;
		City = city;
		Company = company;
		Salary = salary;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [Id=" + Id + ", Name=" + Name + ", City=" + City + ", Company=" + Company + ", Salary=" + Salary
				+ "]";
	}

}