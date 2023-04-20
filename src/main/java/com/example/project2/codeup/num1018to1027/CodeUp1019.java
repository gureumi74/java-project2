package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cmd = sc.nextLine();
        int[] date = new int[3];
        int i = 0;

        for(String s : cmd.split("\\.")) {
            date[i] = Integer.parseInt(s);
            i++;
        }

        System.out.printf("%04d.%02d.%02d", date[0], date[1], date[2]);
    }
}
