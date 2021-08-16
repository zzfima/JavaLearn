package com.company;

public class Main {

    public static void main(String[] args) {
        String item1 = "Apple";
        String item2 = "Banana";
        String item3 = "Grape";
        String[] items = {item1, item2, item3};

        printShoppingList(item1, item2, item3);
        printShoppingList(items);

        printShoppingList1(items);
        printShoppingList1(item1, item2, item3, item1);
    }

    private static void printShoppingList(String item1, String item2) {
        System.out.println("Shopping list of 2 items");
        System.out.println(item1);
        System.out.println(item2);
    }

    private static void printShoppingList(String item1, String item2, String item3) {
        System.out.println("Shopping list of 3 items");
        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);
    }

    private static void printShoppingList(String[] items) {
        System.out.println("Shopping list of " + items.length + " items");
        for (String s : items)
            System.out.println(s);
    }

    private static void printShoppingList1(String... items) {
        System.out.println("Shopping list of " + items.length + " items");
        for (String s : items)
            System.out.println(s);
    }
}