package com.example.project2.codeup.num1059to1070;

import java.util.Scanner;

public class CodeUp1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 3; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
