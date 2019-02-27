package org.feiler.encapsulation;

public class Manager {
	
	private String name;

	public Manager(String name) {
		setName(name);
	}

	public String getname() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name;
	}
 }
