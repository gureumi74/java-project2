package com.example.project2.week4.day16;

import java.util.Scanner;

public class Pyramid3 {
    private String spaceChar = "0";

    public Pyramid3(String spaceChar) {
        this.spaceChar = spaceChar;
    }

    // 한 줄 만드는 기능 분리
    public String makeALine(int height, int i) {
        return String.format("%s%s\n", spaceChar.repeat(height - i - 1),
                "*".repeat(2 * i + 1));
    }

    public void printPyramidWithSpaceChar(int height, String spaceChar) {
        for (int i = 0; i < height; i++) {
            System.out.printf(makeALine(height, i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        Pyramid3 pyramid3 = new Pyramid3(" ");
        Pyramid3 pyramid3SpaceZero = new Pyramid3("0");

        pyramid3.printPyramidWithSpaceChar(height, pyramid3.spaceChar);
        pyramid3SpaceZero.printPyramidWithSpaceChar(height, pyramid3SpaceZero.spaceChar);

    }
}
