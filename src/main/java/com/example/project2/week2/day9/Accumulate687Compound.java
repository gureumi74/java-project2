package com.example.project2.week2.day9;

public class Accumulate687Compound {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;
        for(int i = 0; i < 3; i++) {
            answer += num % 10;
            num /= 10;
        }

        System.out.println(answer);
    }
}
