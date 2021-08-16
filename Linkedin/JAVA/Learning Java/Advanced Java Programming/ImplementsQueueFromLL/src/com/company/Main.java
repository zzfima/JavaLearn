package com.company;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Kolja");
        System.out.println(customer);
        customer.serve();
        System.out.println(customer);

        LinkedList<Customer> customers = new LinkedList<>();
        customers.add(new Customer("Molly"));
        customers.add(new Customer("Harry"));
        customers.add(new Customer("Alex"));
        System.out.println(customers);
        serveCustomers(customers);
    }

    private static void serveCustomers(LinkedList<Customer> customers) {
        while (!customers.isEmpty()) {
            Customer c = customers.remove(0);
            c.serve();
            System.out.println(c);
        }
    }
}
