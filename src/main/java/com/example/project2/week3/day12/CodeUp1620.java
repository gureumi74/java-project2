package com.example.project2.week3.day12;

import java.util.Scanner;

public class CodeUp1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        while (num > 0 || answer > 9) {
            if(num == 0) {
                num = answer;
                answer = 0;
            }
            answer += num % 10;
            num /= 10;
        }

        System.out.println(answer);
    }

}
