package org.feiler.encapsulation;

import java.util.List;
import java.util.stream.Collectors;

public class Person {
	
	private List<String> courses;

	public List<String> getCourses() {
		return this.courses.stream().collect(Collectors.toList());
	}

	public void addCourse(String course) {
		this.courses.add(course);
	}

	public void removeCourse(String course) {
		this.courses.remove(course);
	}
 }
