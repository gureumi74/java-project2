package com.example.project2.codeup.num1071to1092;

import java.util.Scanner;

public class CodeUp1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int n = 1;
        int answer = 0;
        while (answer < input) {
            answer += n;
            n++;
        }

        System.out.println(answer);
    }
}
