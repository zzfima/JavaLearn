package com.company;

public class Main {

    public static void main(String[] args) {
        GreetingMessage gm1 = new GreetingMessage() {
            @Override
            public void Greet(String name) {
                System.out.println("GM1, " + name);
            }
        };
        gm1.Greet("Buddy");

        GreetingMessage gm2 = (s) -> System.out.println("GM2, " + s);
        gm2.Greet("Buddy");

        createInstance("Hello my friend").Greet("Jojo");
    }

    private static GreetingMessage createInstance(String greetingMsg) {
        return (d) -> System.out.println(greetingMsg + ", " + d);
    }
}