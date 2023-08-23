package com.complete.spring.annotaions;

public class Studnet {
	String name;
	
	public Studnet(String name) {
		this.name=name;
	}
	public void studying() {
		System.out.println(this.name+"is studying...");
	}

}
