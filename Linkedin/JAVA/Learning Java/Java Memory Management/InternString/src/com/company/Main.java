package com.company;

public class Main {

    public static void main(String[] args) {
        String s1 = "55";
        String s2 = "55";
        System.out.println((s1 == s2) ? "Same" : "Diff");

        String s3 = "66";
        String s4 = Integer.toString(66);
        System.out.println((s3 == s4) ? "Same" : "Diff");

        //intern
        String s5 = "77";
        String s6 = Integer.toString(77).intern();
        System.out.println((s5 == s6) ? "Same" : "Diff");

    }
}
