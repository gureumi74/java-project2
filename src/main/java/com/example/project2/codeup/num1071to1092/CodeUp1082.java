package com.example.project2.codeup.num1071to1092;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt(16);
        for(int i = 1; i < 16; i++) {
            System.out.printf("%X*%X=%X\n", input, i, input * i);
        }
    }
}
