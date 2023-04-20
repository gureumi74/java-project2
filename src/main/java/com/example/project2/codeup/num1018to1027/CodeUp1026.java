package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bucket = sc.nextLine().split(":");
        System.out.printf("%d", Integer.parseInt(bucket[1]));
    }
}
