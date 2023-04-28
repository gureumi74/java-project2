package com.example.project2.week2.day10;

public class OddEven {
    public static void main(String[] args) {
        int num = 1;
        if(num % 2 == 0) { // 2로 나누었을 때 나머지가 0일 때(짝수일 때) 실행
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
    }
}
