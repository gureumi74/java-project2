package com.example.project2.week2.day8;

public class Accumulate687While {
    public static void main(String[] args) {
        // 변수, 누적, 연산자, 나머지, 몫
        int num = 687;
        int answer =0;

        while (num > 0) {
            answer += num % 10;
            num /= 10;
        }

        System.out.println(answer);
    }
}
