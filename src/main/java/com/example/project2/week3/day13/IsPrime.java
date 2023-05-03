package com.example.project2.week3.day13;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0; // 약수의 개수
        // 7에서 2부터 num 전까지 나눈 나머지 값이 전부 0이면 소수라는 뜻
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                factors++;
            }
        }
        System.out.printf("%d은 소수입니까? : %b", num, factors == 0);
    }
}
