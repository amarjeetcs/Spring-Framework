package com.spring.core.Collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> cources;
	private Properties props;
	
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCources() {
		return cources;
	}
	public void setCources(Map<String, String> cources) {
		this.cources = cources;
	}
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> cources) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.cources = cources;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
