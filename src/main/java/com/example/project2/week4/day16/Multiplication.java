package com.example.project2.week4.day16;

import com.example.project2.week1.day5.SpaceInvadersMemberVariable;

public class Multiplication {
    public static void multiplePrint(int num) {
        for(int i = 1; i < 10; i++) {
            System.out.printf("%d * %d = %d\n", num, i, num * i);
        }
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        multiplePrint(2);
        multiplePrint(4);
        multiplePrint(9);
    }
}
