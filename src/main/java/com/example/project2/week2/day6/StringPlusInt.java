package com.example.project2.week2.day6;

public class StringPlusInt {
    public static void main(String[] args) {
        System.out.println("1" + 1);
        int result = 1 + Integer.parseInt("1");
        System.out.println(result);

        String val1 = "1.5";
        String val2 = "2.5";

        float result2 = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println(result2);

    }
}
