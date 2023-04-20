package com.example.project2.week1.day4;

public class PrintfEx {
    public void print() {
        System.out.printf("%s", "Hello\n"); // enter 없응
        System.out.println("Bye"); // enter 있음
    }

    public static void main(String[] args) {
        PrintfEx printfEx = new PrintfEx();
        printfEx.print();
    }
}
