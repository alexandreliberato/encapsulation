package org.feiler.encapsulation;

import org.feiler.encapsulation.Person;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class MainSolution {

	public static void main(String[] args) {

		System.out.println("\n>> encapsulate collection");

		List<String> courses = new ArrayList<String>(){{add("portuguese"); add("spanish");}};

		Person person = new Person();
		
		courses.forEach(person::addCourse);

		System.out.println("\n> person's courses");
		person.getCourses().forEach(System.out::println);

		System.out.println("\n> lets add new ones");
		List<String> newCourses = new ArrayList<String>(){{add("french"); add("chinese");}};

		newCourses.forEach(person::addCourse);

		System.out.println("> great!");
		person.getCourses().forEach(System.out::println);

		System.out.println("\n");
	}
}
