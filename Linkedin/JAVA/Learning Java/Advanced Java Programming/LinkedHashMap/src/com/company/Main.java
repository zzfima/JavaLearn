package com.company;

import java.util.LinkedHashMap;

public class Main {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Masha", 56781);
        phoneBook.put("Aasha", 56782);
        phoneBook.put("Dasha", 56783);
        phoneBook.put("Zasha", 56784);
        phoneBook.put("Mashb", 5684);

        System.out.println(phoneBook);
    }
}
