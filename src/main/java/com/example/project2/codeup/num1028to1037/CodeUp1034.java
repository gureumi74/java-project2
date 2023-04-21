package com.example.project2.codeup.num1028to1037;

import java.util.Scanner;

public class CodeUp1034 {
    // 8진수로 입력된 정수 1개를 10진수로 바꾸어 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Integer.valueOf(sc.nextLine(), 8));
    }
}
