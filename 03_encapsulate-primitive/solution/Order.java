package org.feiler.encapsulation;

public class Order {

    String description;
    int priority;

    public Order(String description, int priority) {

        this.description = description;
        this.priority = priority;
    }

    public boolean higherThan(Order o) {
        return this.priority > o.priority;
    }

    public String toString() {
        return this.description + "["+this.priority+"]";
    }
}