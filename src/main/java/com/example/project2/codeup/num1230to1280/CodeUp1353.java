package com.example.project2.codeup.num1230to1280;

import java.util.Scanner;

public class CodeUp1353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for(int i = 0; i < input; i++) {
            for(int j = 0; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
