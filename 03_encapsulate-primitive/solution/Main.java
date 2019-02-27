package org.feiler.encapsulation;

import org.feiler.encapsulation.Order;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		System.out.println("\n>> encapsulate primitive");

		List<Order> orders = new ArrayList<Order>(){{
			add(new Order("Order 01", 5));
			add(new Order("Order 02", 8));
			add(new Order("Order 03", 2));
			add(new Order("Order 04", 3));
			add(new Order("Order 05", 7));
		}};

		System.out.println("\n> orders");
		orders.forEach(System.out::println);

		Order minimumOrderPriority = new Order("Order 06", 5);

		List<Order> newOrders = orders.stream()
					.filter(o -> o.higherThan(minimumOrderPriority))
					.collect(Collectors.toList());

		System.out.println("\n> new orders with higher priority");

		newOrders.forEach(System.out::println);

		System.out.println("\n");
	}
}
