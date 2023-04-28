package com.example.project2.codeup.num1116to1124;

import java.util.Scanner;

public class CodeUp1124 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.next().split("H");
        input[0] = input[0].substring(1);
        System.out.println(12 * Integer.parseInt(input[0]) + Integer.parseInt(input[1]));
    }
}
