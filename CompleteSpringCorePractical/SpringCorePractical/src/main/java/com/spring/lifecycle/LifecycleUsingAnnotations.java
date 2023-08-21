package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class LifecycleUsingAnnotations {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public LifecycleUsingAnnotations() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	@PostConstruct
	public void start()
	{
		System.out.println("starting services....");
	}
	
	@PreDestroy //this are the annotaions
	public void end()
	{
		System.out.println("ending services....");
	}

}
