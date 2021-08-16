package com.company;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //List without generics
        List names1 = new ArrayList();
        names1.add("Kelly");
        String name1 = (String) names1.get(0);
        System.out.println(name1);

        //List with generics
        List<String> names2 = new ArrayList<>();
        names2.add("Kelly");
        String name2 = names2.get(0);
        System.out.println(name2);
    }
}
