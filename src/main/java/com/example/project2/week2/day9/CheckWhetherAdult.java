package com.example.project2.week2.day9;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18; // 만 18세 이상
        System.out.println("미성년자입니까? " + !isAdult);
    }
}
