package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> collection1 = new HashSet<>();
        collection1.add(1);
        collection1.add(2);
        collection1.add(1);
        for (Object o : collection1)
            System.out.println(o);

        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(1);
        collection2.add(2);
        collection2.add(1);
        for (Object o : collection2)
            System.out.println(o);

        Map<String, Integer> map = new HashMap<>();
        map.put("august_1", 22);
        map.put("august_15", 24);
        map.put("august_26", 26);
        for (Map.Entry<String, Integer> o : map.entrySet())
            System.out.println(o);
        for (int i : map.values())
            System.out.println(i);

        Queue<Integer> queue = new PriorityQueue<Integer>();
        queue.add(11);
        queue.add(12);
        queue.add(13);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
