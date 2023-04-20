package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisionNum = 10000;

        for(int i = 0; i < 5; i++) {
            System.out.printf("[%d]\n", number / divisionNum * divisionNum);
            number %= divisionNum;
            divisionNum /= 10;
        }
    }
}
