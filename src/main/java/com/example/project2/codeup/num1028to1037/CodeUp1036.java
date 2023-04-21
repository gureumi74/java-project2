package com.example.project2.codeup.num1028to1037;

import java.util.Scanner;

public class CodeUp1036 {
    public static void main(String[] args) {
        // 영문자 1개를 입력받아 아스키 코드표의 10진수 값으로 출력
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        System.out.println((int) c);
    }
}
