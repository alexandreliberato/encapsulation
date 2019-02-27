package org.feiler.encapsulation;

import org.feiler.encapsulation.Organization;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {

		HashMap<String, String> mapOrganization = new HashMap<String, String>() {{
			put("name", "Acme Gooseberries");
			put("country", "GB");
		}};

		System.out.println(mapOrganization.get("name"));
		System.out.println(mapOrganization.get("country"));

		Organization organization = new Organization("Acme Gooseberries", "GB");

		System.out.println(organization);
	}
}
