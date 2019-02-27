package org.feiler.encapsulation;

public class Person {
	
	private String name;

	public Person(String name, Department department){

		setName(name);
		setDepartment(department);
	}

	public Person foundPerson(List<Person> people) {

		for (Person person : people) {

			if (person.getName().equals(getName())) {
				return person;
			}
		}

		return null;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + ":" + this.getDepartment();
	}
 }
