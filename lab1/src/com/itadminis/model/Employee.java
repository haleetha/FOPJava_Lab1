package com.itadminis.model;

public class Employee {
	
	
	private String firstName;
	private String lastName;
	
public Employee(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	

	

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmployeeName() {
		return firstName+" "+lastName;
	}

	

}
