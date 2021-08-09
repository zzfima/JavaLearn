package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "Hello!";
        var s2 = "Hello!";
        String s3 = new String("Hello!");
        String s4 = new String("Hello!");

        System.out.println(s1 == s2 ? "Match" : "Do not match");

        System.out.println(s1 == s3 ? "Match" : "Do not match");
        System.out.println(s1 == s4 ? "Match" : "Do not match");
        System.out.println(s2 == s3 ? "Match" : "Do not match");
        System.out.println(s2 == s4 ? "Match" : "Do not match");
        System.out.println(s3 == s4 ? "Match" : "Do not match");
    }
}
