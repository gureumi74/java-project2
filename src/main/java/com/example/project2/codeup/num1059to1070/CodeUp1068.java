package com.example.project2.codeup.num1059to1070;

import java.util.Scanner;

public class CodeUp1068 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 70) {
            System.out.println("B");
        } else if(score >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}
