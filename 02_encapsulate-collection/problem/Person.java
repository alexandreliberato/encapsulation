package org.feiler.encapsulation;

import java.util.List;

public class Person {
	
	private List<String> courses;

	public List<String> getCourses() {
		return this.courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
 }
