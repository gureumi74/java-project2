package com.example.project2.week3.day12;

public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int answer = 1;
        for (int i = 2; i <= 5; i++) {
            answer *= i;
        }

        // 역순으로 구할 때
        int n2 = 5;
        int answer2 = 1;
        for (int i = 5; i >= 1; i--) {
            answer2 *= i;
        }

        System.out.println(answer);
        System.out.println(answer2);
    }
}
