package com.company;

public class Main {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Free memory before for: " + runtime.freeMemory() / (1024 * 1024) + " Mb");
        for (int i = 0; i < 1000000; i++) {
            Customer c = new Customer("Vasia" + i);
        }
        System.out.println("Free memory after for: " + runtime.freeMemory() / (1024 * 1024) + " Mb");
        runtime.gc();
        System.out.println("Free memory after gc: " + runtime.freeMemory() / (1024 * 1024) + " Mb");
    }
}