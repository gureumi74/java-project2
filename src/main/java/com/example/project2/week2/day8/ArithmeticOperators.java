package com.example.project2.week2.day8;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        System.out.printf("a + b = %d\n", a + b);
        System.out.printf("a - b = %d\n", a - b);
        System.out.printf("a * b = %d\n", a * b);
        System.out.printf("a / b = %d\n", a / b); // 몫
        System.out.printf("a %% b = %d\n", a % b); // 나머지

        System.out.printf("%d를 %d로 나눈 몫은 %d이고 나머지는 %d이다.", a, b, a / b, a % b);
    }
}
