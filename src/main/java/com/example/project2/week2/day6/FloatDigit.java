package com.example.project2.week2.day6;

public class FloatDigit {
    public static void main(String[] args) {
        float f5 = 1.23e5f;
        float f6 = 1.23e6f;
        float f7 = 1.23e7f;
        float f8 = 1.23e8f;
        float f9 = 1.23e9f;
        float f10 = 1.23e10f; // 여기서부터 출력 이상해짐
        double d10 = 1.23e10;

        System.out.println("f7 = " + f7);
        System.out.println("f8 = " + f8);
        System.out.println("f9 = " + f9);
        System.out.println("f10 = " + f10);
        System.out.println("d10 = " + d10); // double을 이용하니까 정상적으로 출력
    }
}