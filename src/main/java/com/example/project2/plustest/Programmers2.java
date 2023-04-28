package com.example.project2.plustest;

public class Programmers2 {
    public static int solution(int num) {
        int answer = 0;
        while (num > 1) {
            if(num % 2 == 0) {
                num /= 2;
            } else {
                num *= 3;
                num += 1;
            }

            answer++;
            if (answer >= 500) {
                break;
            }
        }

        return num == 1 ? answer : -1;
    }
    public static void main(String[] args) {
        int num = 626331;
        int answer = solution(num);
        System.out.println(answer);
    }
}
