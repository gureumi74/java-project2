package com.example.project2.codeup.num1116to1124;

import java.util.Scanner;

public class CodeUp1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.printf("%d+%d=%d\n", num1, num2, num1 + num2);
        System.out.printf("%d-%d=%d\n", num1, num2, num1 - num2);
        System.out.printf("%d*%d=%d\n", num1, num2, num1 * num2);
        System.out.printf("%d/%d=%d\n", num1, num2, num1 / num2);
    }
}
