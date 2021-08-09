package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = new String("marpf");
        String s2 = new String("larpf");
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
    }

    private static int sum(int i1, int i2) {
        return i1 + i2;
    }

    private static int sum(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    private static int sum(int... numbers) {
        int s = 0;
        for (int i : numbers)
            s += i;
        return s;
    }
}
