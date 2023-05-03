package com.example.project2.codeup.num1230to1280;

import java.util.Scanner;

public class CodeUp1274 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        String prime = "prime";
        for(int i = 2; i <= inputNum / 2; i++) {
            if(inputNum % i == 0) {
                prime = "not prime";
                break;
            }
        }
        System.out.println(prime);
    }
}
