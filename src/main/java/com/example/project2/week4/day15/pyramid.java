package com.example.project2.week4.day15;

import java.util.Scanner;

public class pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        for(int i = 1; i <= input; i++) {
            System.out.print(" ".repeat(input - i));
            System.out.println("*".repeat(i + count));
            count++;
        }
    }
}
