package org.feiler.encapsulation;

import org.feiler.encapsulation.Person;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n>> encapsulate collection");

		List<String> courses = new ArrayList<String>(){{add("portuguese"); add("spanish");}};

		Person person = new Person();
		person.setCourses(courses);

		System.out.println("> person's courses");
		person.getCourses().forEach(System.out::println);

		System.out.println("> lets add new ones");
		List<String> newCourses = new ArrayList<String>(){{add("french"); add("chinese");}};

		person.setCourses(newCourses);

		System.out.println("> oops");
		person.getCourses().forEach(System.out::println);

		System.out.println("\n");
	}
}
