package org.feiler.encapsulation;

public class Person {
	
	private String name;

	public Person(String name, Department department){

		setName(name);
		setDepartment(department);
	}

	public Person foundPerson(List<Person> people) {

		return  people.stream()
					.filter(p -> p.getName().equals(getName()))
					.collect().findFirst();
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
