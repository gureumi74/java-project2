package com.example.project2.codeup.num1071to1092;

import java.util.Scanner;

public class CodeUp1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long startNum = sc.nextInt();
        int multiplicationNum = sc.nextInt();
        int plusNum = sc.nextInt();
        int countNum = sc.nextInt();

        for(int i = 0; i < countNum - 1; i++) {
            startNum *= multiplicationNum;
            startNum += plusNum;
        }
        System.out.println(startNum);
    }
}
