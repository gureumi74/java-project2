package com.example.project2.week2.day9;

public class CompoundAssignmentOperator {
    public static void main(String[] args) {
        int x = 10;
        x += 1;
        System.out.println("+=1 : " + x);
        x -= 5;
        System.out.println("-=5 : " + x);
        x *= 2;
        System.out.println("*=2 : " + x);
        x /= 3;
        System.out.println("/=3 : " + x);
        x %= 8;
        System.out.println("%=8 : " + x);
    }
}
