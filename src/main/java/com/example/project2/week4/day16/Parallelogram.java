package com.example.project2.week4.day16;

import java.util.Scanner;

public class Parallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for(int i = 1; i <= height; i++) {
            System.out.printf("%s%s\n", "0".repeat(height - i), "*".repeat(height));
        }
    }
}
