package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age is " + age);

        //patch
        scanner.nextLine();
        System.out.print("Inter your name: ");
        String name = scanner.nextLine();
        System.out.println("Your name is " + name);
    }
}
