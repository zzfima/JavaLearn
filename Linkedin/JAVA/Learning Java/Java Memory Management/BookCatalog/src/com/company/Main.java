package com.company;

public class Main {

    public static void main(String[] args) {
        BookCollection bc = new BookCollection();

        System.out.println("Get price of book called Tom Jones in EUR: " +
                bc.findBookByName("Tom Jones").getPrice().convert("EUR"));
        bc.printAllBooks();
    }
}
