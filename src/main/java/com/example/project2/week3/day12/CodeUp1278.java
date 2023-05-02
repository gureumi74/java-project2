package com.example.project2.week3.day12;

import java.util.Scanner;

public class CodeUp1278 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input.length());

        //int 로만 풀기
        int input2 = sc.nextInt();
        int count = 0;
        while (input2 > 0) {
            input2 /= 10;
            count++;
        }

        System.out.println(count);
    }
}
