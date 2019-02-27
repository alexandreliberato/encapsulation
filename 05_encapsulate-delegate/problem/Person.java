package org.feiler.encapsulation;

public class Person {
	
	private String name;
	private Department department;

	public Person(String name, Department department){

		setName(name);
		setDepartment(department);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}	

	public Department getDepartment() {
		return this.department;
	}

	public String toString() {
		return this.name + ":" + this.getDepartment();
	}
 }
