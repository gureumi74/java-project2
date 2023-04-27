package com.example.project2.plustest;

import java.util.Scanner;

public class BaekJoon5585 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int payment = 1000 - sc.nextInt();
        int count = 0;
        while (payment > 0) {
            if(payment >= 500) {
                count += payment / 500;
                payment %= 500;
            } else if (payment >= 100) {
                count += payment / 100;
                payment %= 100;
            } else if (payment >= 50) {
                count += payment / 50;
                payment %= 50;
            } else if (payment >= 10) {
                count += payment / 10;
                payment %= 10;
            } else if (payment >= 5) {
                count += payment / 5;
                payment %= 5;
            } else {
                count += payment;
                break;
            }
        }

        System.out.println(count);
    }
}
