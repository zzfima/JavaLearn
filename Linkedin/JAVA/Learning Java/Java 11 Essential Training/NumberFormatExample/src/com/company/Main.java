package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        NumberFormat numIntFormat = NumberFormat.getIntegerInstance();
        System.out.println(numIntFormat.format(3454343434.6));
        numIntFormat.setGroupingUsed(false);
        System.out.println(numIntFormat.format(3454343434.6));

        NumberFormat numCurrFormatLocal = NumberFormat.getCurrencyInstance();
        System.out.println(numCurrFormatLocal.format(345.6));

        NumberFormat numCurrFormatUSA = NumberFormat.getCurrencyInstance(Locale.US);
        System.out.println(numCurrFormatUSA.format(345.6));

        String items = String.format("My name is %s, my age is %d and my weight is %.1f", "Coco", 56, 23.37);
        System.out.println(items);
    }
}
