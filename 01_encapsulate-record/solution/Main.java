package org.feiler.encapsulation;

import org.feiler.encapsulation.Organization;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n>> encapsulate register");

		Organization organization = new Organization("Acme Gooseberries", "GB");

		System.out.println("> object");
		System.out.println(organization);

		System.out.println("\n");
	}
}
