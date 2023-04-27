package com.example.project2.week2.day9;

public class OrExample {
    public static void main(String[] args) {
        int yearsOfExp = 8; // 8년차
        int numOfProj = 12; // 프젝 경험 12회
        boolean isPromotion = yearsOfExp > 5 || numOfProj > 10; // 둘 중에 하나만 참이여도 승진
        System.out.println("팀장 승진 여부 : " + isPromotion);

    }
}
