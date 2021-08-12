package com.company;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John1"));
        records.addCustomer(new Customer("Simon1"));
        records.addCustomer(new Customer("John2"));
        records.addCustomer(new Customer("Simon2"));

        /*
        records.getCustomers().clear();
        records.iterator().remove();
        */

        for (Customer next : records) {
            System.out.println(next);
        }
    }
}
