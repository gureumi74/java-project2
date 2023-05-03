package com.example.project2.codeup.num1230to1280;

import java.util.Scanner;

public class CodeUp1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        for(int i = 1; i <= inputNum; i++) {
            if(inputNum % i == 0) {
                System.out.printf("%d ", i);
            }
        }
    }
}
