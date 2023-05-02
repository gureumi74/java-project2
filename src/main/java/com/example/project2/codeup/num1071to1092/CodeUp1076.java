package com.example.project2.codeup.num1071to1092;

import java.util.Scanner;

public class CodeUp1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.next().charAt(0);

        for(int i = 0; i <= input - 'a'; i++) {
            System.out.print((char)('a' + i) + " ");
        }

        // char로 선언해도 가능
        for(char c = 'a'; c <= input; c++) {
            System.out.printf("%c ", c);
        }
    }
}
