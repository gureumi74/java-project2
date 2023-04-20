package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine();
        String number = "";

        for(String s : cmd.split("-")) {
            number += s;
        }

        System.out.printf(number);
    }
}
