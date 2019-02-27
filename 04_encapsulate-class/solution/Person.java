package org.feiler.encapsulation;

import org.feiler.encapsulation.TelephoneNumber;

public class Person {
	
	private String name;
	private TelephoneNumber telephoneNumber;

	public Person(String name) {
		this.setTelephoneNumber(new TelephoneNumber());
	}

	public Person(String name, String officeAreaCode, String officeNumber) {

		this.setName(name);
		this.setOfficeAreaCode(officeAreaCode);
		this.setOfficeNumber(officeNumber);
	}

	public Person(String name, TelephoneNumber telephoneNumber) {

		this.setName(name);
		this.setTelephoneNumber(telephoneNumber);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOfficeAreaCode(String officeAreaCode) {

		if (this.telephoneNumber == null) {
			this.telephoneNumber = new TelephoneNumber();
		}

		this.telephoneNumber.setOfficeAreaCode(officeAreaCode);
	}	

	public String getOfficeAreaCode() {
		return this.telephoneNumber.getOfficeAreaCode();
	}

	public void setOfficeNumber(String officeNumber) {
		
		if (this.telephoneNumber == null) {
			this.telephoneNumber = new TelephoneNumber();
		}

		this.telephoneNumber.setOfficeNumber(officeNumber);
	}	

	public String getOfficeNumber() {
		return this.telephoneNumber.getOfficeNumber();
	}

	public TelephoneNumber setTelephoneNumber(TelephoneNumber telephoneNumber) {
		return this.telephoneNumber = telephoneNumber;
	}

	public String getTelephoneNumber() {
		return this.telephoneNumber.toString();
	}

	public String toString() {
		return this.name + ":" + this.getTelephoneNumber();
	}
 }
