package com.example.project2.week4.day16;

import java.util.Scanner;

public class Pyramid2 {
    private String spaceChar = "0";

    public Pyramid2(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    public void printPyramid(int height) {
        for(int i = 0; i < height; i++) {
            System.out.printf("%s%s\n", spaceChar.repeat(height - i - 1),
                    "*".repeat(2 * i + 1));
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        Pyramid2 pyramid2 = new Pyramid2(" "); // argument " "를 넘겨서 초기화
        Pyramid2 pyramid2SpaceZero = new Pyramid2("0"); // argument "0"을 넘겨서 초기화

        pyramid2.printPyramid(height);
        pyramid2SpaceZero.printPyramid(height);
    }
}
