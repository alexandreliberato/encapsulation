package org.feiler.encapsulation;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n>> encapsulate register");

		HashMap<String, String> mapOrganization = new HashMap<String, String>() {{
			put("name", "Acme Gooseberries");
			put("country", "GB");
		}};

		System.out.println("> valores do registro");
		System.out.println(mapOrganization.get("name"));
		System.out.println(mapOrganization.get("country"));
	}
}
