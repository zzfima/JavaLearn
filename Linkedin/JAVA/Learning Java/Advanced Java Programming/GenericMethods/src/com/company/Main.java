package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private final static Boolean[] booleans = {true, false};
    private final static Integer[] integers = {5, 6, 7};
    private final static Character[] characters = {'a', 'k', 'u'};

    public static void main(String[] args) {
        List<Boolean> booleanList = objectToList(booleans);
        List<String> integerList = objectToList(integers);
        List<Character> characterList = objectToList(characters);
        System.out.println(integerList.get(0));
    }

    private static List objectToList(Object[] objects) {
        List<Object> list = new ArrayList<>();
        for (Object o : objects)
            list.add(o);

        return list;
    }
}
