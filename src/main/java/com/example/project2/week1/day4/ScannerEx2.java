package com.example.project2.week1.day4;

import java.util.Scanner;

public class ScannerEx2 {
    public void printWithScanner() {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 개의 숫자를 입력하세요.");
        System.out.print("첫 번째 숫자 입력: ");
        System.out.println("첫 번째 숫자는 " + sc.nextInt() + " 입니다.");
        System.out.print("두 번째 숫자 입력: ");
        System.out.println("두 번째 숫자는 " + sc.nextInt() + " 입니다.");
    }
}
