package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] number = new int[2];
        int i = 0;
        for(String ss : s.split("\\.")) {
            number[i] = Integer.parseInt(ss);
            i++;
        }

        System.out.println(number[0]);
        System.out.println(number[1]);
    }
}
