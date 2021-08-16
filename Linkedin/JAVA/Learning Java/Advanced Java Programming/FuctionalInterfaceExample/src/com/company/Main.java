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

        GreetingMessage gm3 = createInstance("Hello my friend");
        printMsg(gm3, "Zvulon");
    }

    private static GreetingMessage createInstance(String greetingMsg) {
        return (d) -> System.out.println(greetingMsg + ", " + d);
    }

    private static void printMsg(GreetingMessage gm, String msg) {
        gm.Greet(msg);
    }
}