package com.spring.core.AutowiredWithAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp1 {
	@Autowired
	// @Qualifier("temp1")
	private Address address;

	@Autowired
	private Address1 address1;

	public Address1 getAddress1() {
		return address1;
	}

	public void setAddress1(Address1 address1) {
		this.address1 = address1;
	}

	public Address getAddress() {
		return address;
	}

	/* @Autowired */
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("setting values...");
	}

	@Override
	public String toString() {
		return "Emp1 [address=" + address + ", address1=" + address1 + "]";
	}

	/*
	 * @Autowired public Emp1(Address address) { super(); this.address = address;
	 * System.out.println("inside the constructor calling...."); }
	 */



}
