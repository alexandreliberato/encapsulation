package org.feiler.encapsulation;

import org.feiler.encapsulation.Person;
import org.feiler.encapsulation.Department;
import org.feiler.encapsulation.Manager;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n>> hide delegate");

		Department department = new Department();
		department.setChargeCode("054813");
		department.setManager(new Manager("Martin Fowler"));

		List<Person> people = new ArrayList<Person>(){{
			add(new Person("Alexandre", department));
			add(new Person("Amanda", department));
			add(new Person("Breno", department));
			add(new Person("Andressa", department));
		}};

		System.out.println("\n> people with their departments");
		people.forEach(System.out::println);

		System.out.println("\n");
	}
}
