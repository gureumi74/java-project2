package com.example.project2.week3.day13;

public class Programmers1 {
    public static int solution(int n) {
        int answer = n;
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(solution(n));
    }
}
