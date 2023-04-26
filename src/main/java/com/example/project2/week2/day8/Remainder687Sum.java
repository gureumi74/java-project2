package com.example.project2.week2.day8;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int[] remainder687 = new int[3];
        for(int i = 0; i < 3; i++) {
            remainder687[i] = num % 10;
            num /= 10;
        }
        System.out.println(remainder687[0] + remainder687[1] + remainder687[2]);
    }

}
