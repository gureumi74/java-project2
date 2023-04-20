package com.example.project2.codeup;

import java.util.Scanner;

public class CodeUp1015 {
    // 실수 입력받아 둘째 자리까지 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num = sc.nextFloat();
        System.out.printf("%.2f", num);
    }
}
