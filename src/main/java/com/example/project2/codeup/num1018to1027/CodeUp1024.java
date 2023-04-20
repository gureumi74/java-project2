package com.example.project2.codeup.num1018to1027;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        for(String s : word.split("")) {
            System.out.println("\'" + s + "\'");
        }
    }
}
