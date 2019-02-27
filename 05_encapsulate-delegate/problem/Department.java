package org.feiler.encapsulation;

public class Department {
	
	private String chargeCode;
	private Manager manager;

	public String getchargeCode() {
		return this.chargeCode;
	}

	public void setChargeCode(String chargeCode) {
		this.chargeCode = chargeCode;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}	

	public Manager getManager() {
		return this.manager;
	}

	public String toString() {
		return this.chargeCode + ":" + this.getManager();
	}
 }
