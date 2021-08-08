package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome");

        int[][] k = new int[10][];
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    Runtime.getRuntime().maxMemory() + " " +
                            Runtime.getRuntime().freeMemory() + " " +
                            Runtime.getRuntime().totalMemory());

            k[i] = new int[1_048_576];
        }
    }
}
