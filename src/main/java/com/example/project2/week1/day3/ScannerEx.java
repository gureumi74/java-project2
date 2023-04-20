package com.example.project2.week1.day3;

import java.util.Scanner;

public class ScannerEx {
    public void readTwoNumbersAndPlus() {
        Scanner sc = new Scanner(System.in);
        System.out.println("두 개의 숫자를 입력하세요. 각 숫자마다 입력 후 엔터");
        System.out.println(sc.nextInt() + sc.nextInt());
    }
}
