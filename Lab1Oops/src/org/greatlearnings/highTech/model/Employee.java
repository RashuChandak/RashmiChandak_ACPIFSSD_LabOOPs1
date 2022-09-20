package org.greatlearnings.highTech.model;

public class Employee {
    private String firstname;
	private String lastName;
	public Employee() { 
	// TODO Auto-generated method stub
  }
	public Employee(String firstname, String lastName) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
