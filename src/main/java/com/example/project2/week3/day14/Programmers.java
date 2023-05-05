package com.example.project2.week3.day14;

public class Programmers {
    public static void main(String[] args) {
        String numbers = "17";
        System.out.println(solution(numbers));
    }
    public static int solution(String numbers) {
        int answer = 0;
        String[] numStrArr = numbers.split("");
        for(int i = 0; i < numStrArr.length; i++) {

        }
        return answer;
    }
    public static boolean isPrime(int num) {
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
