package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] time = new int[2];
        int i = 0;

        String cmd = sc.nextLine();
        for(String s : cmd.split(":")) {
            time[i] = Integer.parseInt(s);
            i++;
        }

        System.out.printf("%d:%d", time[0], time[1]);
    }
}
