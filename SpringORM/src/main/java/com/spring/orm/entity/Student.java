package com.spring.orm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String city;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String city, String name) {
		super();
		this.id = id;
		this.city = city;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", city=" + city + ", name=" + name + "]";
	}
	
	
	

}
