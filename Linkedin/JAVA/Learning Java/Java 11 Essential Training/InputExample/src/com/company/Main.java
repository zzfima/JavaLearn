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

        System.out.println("please enter 2 numbers");
        float f1 = scanner.nextFloat();
        float f2 = scanner.nextFloat();
        System.out.println(String.format("Number %.2f divide by number %.2f is %.2f", f1, f2, f1 / f2));

        switch ((int) f1) {
            case 5:
                System.out.println("is 5!");
                break;
            default:
                System.out.println("its not 5");
        }
    }
}
