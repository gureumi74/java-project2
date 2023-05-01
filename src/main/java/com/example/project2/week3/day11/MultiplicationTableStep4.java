package com.example.project2.week3.day11;

public class MultiplicationTableStep4 {
    public static void printDan(int dan) {
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", dan, i, dan * 1);
        }
        System.out.println("-----------------");
    }
    public static void main(String[] args) {
        printDan(2);
        printDan(4);
        printDan(6);
        printDan(8);
    }
}
