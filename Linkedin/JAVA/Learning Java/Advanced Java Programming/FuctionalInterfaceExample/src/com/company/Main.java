package com.company;

public class Main {

    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void Greet(String name) {
                System.out.println("GM1, " + name);
            }
        };

        gm.Greet("Buddy");
    }
}