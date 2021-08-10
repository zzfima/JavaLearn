package com.company;

public class Main {

    public static void main(String[] args) {
        printS("static");
        new Main().print("non static");
    }

    static void printS(String s) {
        System.out.println(s);
    }

    void print(String s) {
        System.out.println(s);
    }
}
