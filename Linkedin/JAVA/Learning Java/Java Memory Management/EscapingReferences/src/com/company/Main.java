package com.company;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John1"));
        records.addCustomer(new Customer("Simon1"));
        records.addCustomer(new Customer("John2"));
        records.addCustomer(new Customer("Simon2"));

        //records.getCustomers().put("Simon5", new Customer("Nikolay"));
        //records.getCustomers().clear();

        for (CustomerReadOnly next : records.getCustomers().values()) {
            System.out.println(next);
        }

        System.out.println(records.getCustomerByName("John1"));
    }
}
