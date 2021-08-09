package com.company;

public class Main {

    public static void main(String[] args) {
        String s = new String("Noknok");

        try {
            System.out.println(s.getBytes());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finitely");
        }
        System.out.println("Go sleep");
    }
}
