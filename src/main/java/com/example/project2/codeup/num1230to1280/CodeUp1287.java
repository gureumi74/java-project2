package com.example.project2.codeup.num1230to1280;

import java.util.Scanner;

public class CodeUp1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= input * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
