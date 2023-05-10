package com.example.project2.week4.day17;

public class RightTriangleDraw {
    public void printShape() {
        int h = 5;
        for(int i = 1; i <= h; i++) {
            System.out.printf("%s%s\n", "0".repeat(h - i), "*".repeat(2 * - 1));
        }
    }
    public static void main(String[] args) {
        RightTriangleDraw rtd = new RightTriangleDraw();
        rtd.printShape();
    }
}
