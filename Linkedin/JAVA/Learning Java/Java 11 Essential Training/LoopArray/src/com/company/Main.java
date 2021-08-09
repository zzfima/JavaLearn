package com.company;

public class Main {

    public static void main(String[] args) {
        String[] months = {
                "January",
                "February",
                "March",
                "April",
                "May",
                "June",
                "July",
                "August",
                "September",
                "October",
                "November",
                "December"};

        System.out.println();
        for (int i = 0; i < months.length; i++)
            System.out.print(months[i] + " ");

        System.out.println();
        for (String month : months)
            System.out.print(month + " ");
    }
}
