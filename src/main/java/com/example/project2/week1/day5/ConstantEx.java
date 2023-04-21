package com.example.project2.week1.day5;

import com.example.project2.test.PrintHello;

public class ConstantEx {
    // 전역 상수
    public final int MAX_LEVEL = 3;
    public static void main(String[] args) {
        // 지역 상수
        final int iVal = 1;
        System.out.println(iVal);

        // final 레퍼런스에도 사용 가능
        final PrintHello printHello = new PrintHello();
    }
}
