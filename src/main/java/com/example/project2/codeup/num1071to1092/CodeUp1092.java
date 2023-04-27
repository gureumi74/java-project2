package com.example.project2.codeup.num1071to1092;

import java.util.Scanner;

public class CodeUp1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        int input3 = sc.nextInt();
        int day = 2;

        while (day % input1 != 0 || day % input2 != 0 || day % input3 != 0) {
            day++;
        }
        System.out.println(day);
    }
}
