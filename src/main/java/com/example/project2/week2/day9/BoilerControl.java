package com.example.project2.week2.day9;

public class BoilerControl {
    public static void main(String[] args) {
        int waterTemperature = 45;
        int roomTemperature = 22;

        boolean check = waterTemperature < 50 && roomTemperature < 25;
        System.out.printf("check: %b\n", check);
    }
}
