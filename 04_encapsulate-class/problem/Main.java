package org.feiler.encapsulation;

import org.feiler.encapsulation.Person;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n>> encapsulate class");

		List<Person> people = new ArrayList<Person>(){{
			add(new Person("Alexandre", "(41)", "3223-5151"));
			add(new Person("Amanda", "(41)", "99850-4169"));
			add(new Person("Breno", "(57)", "3333-3333"));
			add(new Person("Andressa", "(85)", "9445-5464"));
		}};

		System.out.println("\n> people with their telephone numbers");
		people.forEach(System.out::println);

		List<String> areaCodes = people.stream()
						.map(Person::getOfficeAreaCode)
						.collect(Collectors.toList());

		System.out.println("\n> area codes");
		areaCodes.forEach(System.out::println);

		List<String> phoneNumbers = people.stream()
						.map(Person::getOfficeNumber)
						.collect(Collectors.toList());

		System.out.println("\n> phones numbers");
		phoneNumbers.forEach(System.out::println);

		System.out.println("\n");
	}
}
