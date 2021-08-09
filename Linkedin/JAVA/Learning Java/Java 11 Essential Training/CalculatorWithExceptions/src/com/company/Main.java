package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input 2 numbers and math operation: +,-,/,*");
        double firstNumber = 0;
        double secondNumber = 0;
        try {
            firstNumber = scanner.nextDouble();
            secondNumber = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException. Please input valid values");
        }

        scanner.nextLine();
        String optStr = scanner.nextLine();
        if (optStr.length() != 1) {
            System.out.println("Please input valid math operation");
        }
        char optChar = optStr.charAt(0);

        switch (optChar) {
            case '*' -> System.out.println(firstNumber * secondNumber);
            case '/' -> System.out.println(firstNumber / secondNumber);
            case '-' -> System.out.println(firstNumber - secondNumber);
            case '+' -> System.out.println(firstNumber + secondNumber);
            default -> System.out.println("Please input valid math operation");
        }

        /*
        old fashion:
        switch (optChar) {
            case '*':
                System.out.println(firstNumber * secondNumber);
                break;
            case '/':
                System.out.println(firstNumber / secondNumber);
                break;
            case '-':
                System.out.println(firstNumber - secondNumber);
                break;
            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            default:
         */
    }
}
