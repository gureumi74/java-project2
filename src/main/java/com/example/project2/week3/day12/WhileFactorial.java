package com.example.project2.week3.day12;

public class WhileFactorial {
    public static void main(String[] args) {
        // 5! = 120
        int n = 5;
        int answer = 1;
        while (n > 0) {
            answer *= n--;
        }
        System.out.println(answer);
    }
}
