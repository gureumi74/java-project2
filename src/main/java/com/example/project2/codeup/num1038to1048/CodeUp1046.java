package com.example.project2.codeup.num1038to1048;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        int sum = 0;
        for (String s : input) {
            sum += Integer.parseInt(s);
        }

        System.out.println(sum);
        System.out.printf("%.1f", sum/3.);
    }
}
