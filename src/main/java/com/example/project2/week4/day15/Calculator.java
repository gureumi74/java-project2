package com.example.project2.week4.day15;

public class Calculator {
    public static int printPlus(int kor, int eng, int math) { //매개변수 3개
        return (kor + eng + math) / 3;
    }

    public static void main(String[] args) {
        int kor = 78;
        int eng = 90;
        int math = 82;
        System.out.printf("평균 : %d\n", printPlus(kor, eng, math));
    }
}
