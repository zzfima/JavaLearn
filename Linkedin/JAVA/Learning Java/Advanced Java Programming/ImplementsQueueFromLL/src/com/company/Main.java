package com.company;

public class Main {

    public static void main(String[] args) {
        Customer customer1 = new Customer("Kolja");
        System.out.println(customer1);
        customer1.serve();
        System.out.println(customer1);
    }
}
