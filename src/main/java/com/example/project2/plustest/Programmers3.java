package com.example.project2.plustest;

import java.util.Scanner;

public class Programmers3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
//        for (int i = 0; i < column; i++) {
//            for (int j = 0; j < row; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // 개꿀팁 .repeat하면 한 줄 걍 완성 ^-^..!
        for(int i = 0; i <column; i++) {
            System.out.println("*".repeat(row));
        }
    }
}
