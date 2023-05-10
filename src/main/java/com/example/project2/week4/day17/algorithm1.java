package com.example.project2.week4.day17;

public class algorithm1 {
    public void printStar(int num) {
        int pivot = num / 2;
        for(int i = 0; i < num; i++) {
            if (pivot >= i) {
                System.out.print(" ".repeat(pivot - i));
                System.out.println("*".repeat(2 * i + 1));
            } else {
                System.out.print(" ".repeat(i - pivot));
                System.out.println("*".repeat(2 * (num - i) - 1));
            }
        }
    }
    public static void main(String[] args) {
        int height = 5;
        algorithm1 solution = new algorithm1();
        solution.printStar(height);
    }
}
