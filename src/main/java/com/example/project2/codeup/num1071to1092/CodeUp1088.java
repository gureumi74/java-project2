package com.example.project2.codeup.num1071to1092;

import java.util.Scanner;

public class CodeUp1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 1; i <= input; i++) {
            if (i % 3 != 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
