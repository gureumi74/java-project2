package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bucket = sc.nextLine().split("\\.");
        System.out.println(bucket[2] + "-" +
                bucket[1] + "-" +
                bucket[0]);
    }
}
