package org.feiler.encapsulation;

public class TelephoneNumber {
	
	private String officeAreaCode;
	private String officeNumber;

	public TelephoneNumber() {}

	public TelephoneNumber(String officeAreaCode, String officeNumber) {

		this.officeAreaCode = officeAreaCode;
		this.officeNumber = officeNumber;
	}

	public void setOfficeAreaCode(String officeAreaCode) {
		this.officeAreaCode = officeAreaCode;
	}	

	public String getOfficeAreaCode() {
		return this.officeAreaCode;
	}

	public void setOfficeNumber(String officeNumber) {
		this.officeNumber = officeNumber;
	}	

	public String getOfficeNumber() {
		return this.officeNumber;
	}

	public String getTelephoneNumber() {
		return this.officeAreaCode + " " + this.officeNumber;
	}

	public String toString() {
		return this.getTelephoneNumber();
	}
 }
