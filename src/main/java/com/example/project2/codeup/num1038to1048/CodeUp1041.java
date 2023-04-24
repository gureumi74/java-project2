package com.example.project2.codeup.num1038to1048;

import java.util.Scanner;

public class CodeUp1041 {
    // 영문자 1개를 입력받아 그 다음 문자 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);
        System.out.println((char)(input + 1));
    }
}