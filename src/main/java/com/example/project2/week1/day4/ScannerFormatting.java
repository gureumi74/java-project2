package com.example.project2.week1.day4;

import java.util.Scanner;

public class ScannerFormatting {
    public static void main(String[] args) {
        // byte = 127~-128까지
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        System.out.printf("%d와 %d의 합은 %d입니다.", val1, val2, val1 + val2);

    }
}
