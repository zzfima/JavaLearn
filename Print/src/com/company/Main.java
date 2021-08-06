package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scanner = new Scanner(in);
        int i = scanner.nextInt();
        System.out.println("You entered " + i);

        switch (i) {
            case 10 -> System.out.println("You entered 10");
            default -> System.out.println("You entered nor 10 nor 15");
        }
        /** OLD fashion switch
         switch (i) {
         case 10:
         System.out.println("You entered 10");
         break;
         default:
         System.out.println("You entered not 10");
         break;
         }
         **/

        //for loop
        for (int cnt = 0; cnt < 4; cnt++)
            System.out.println("For loop: " + cnt);

        //while loop
        i = 0;
        while (i < 4) {
            System.out.println("while loop: " + i);
            i++;
        }

        //do while loop
        i = 0;
        do {
            System.out.println("do while loop: " + i);
            i++;
        }
        while (i < 4);

        //arrays
        String[] words = new String[]{"One", "Two", "Three"};
        for (var c = 0; c < words.length; c++)
            System.out.println(words[c]);
    }
}