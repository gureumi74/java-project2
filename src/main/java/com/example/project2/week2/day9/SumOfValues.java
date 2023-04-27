package com.example.project2.week2.day9;

public class SumOfValues {
    public static void main(String[] args) {
        int[] arr = {2, 1, 7, 4};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
