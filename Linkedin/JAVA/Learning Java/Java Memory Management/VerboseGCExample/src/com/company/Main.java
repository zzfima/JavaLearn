package com.company;

import java.util.ArrayList;

//Set VM settings:
// -verbose:gc
// -Mxm10m
//-Mxs10m

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Customer> customers = new ArrayList<>();

        while (true) {
            customers.add(new Customer("Mos"));
            if (customers.size() >= 100) {
                //System.out.println("Remove 10 customers...");
                for (int i = 0; i < 10; i++) {
                    customers.remove(0);
                }
//                Thread.sleep(1);
            }
        }
    }
}