package com.spring.core.scope;

public class SpringPrototypeScope {
	private int id;
	private String name;
	private String city;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public SpringPrototypeScope() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SpringPrototypeScope(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "SpringPrototypeScope [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

}
