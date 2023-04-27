package com.example.project2.codeup.num1071to1092;

import java.util.Scanner;

public class CodeUp1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNum = sc.nextInt();
        int multiplicationNum = sc.nextInt();
        int countNum = sc.nextInt();

        System.out.printf("%.0f", startNum * (Math.pow(multiplicationNum, countNum - 1)));
    }
}
