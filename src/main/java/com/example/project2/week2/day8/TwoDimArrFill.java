package com.example.project2.week2.day8;

import java.util.Arrays;

public class TwoDimArrFill {
    public static void FillRow(int[][] arr, int rowNum) {
        for(int i = 0; i < 5; i++) {
            arr[rowNum][i] = 1;
        }
        printTwoDimArr(arr);

    }
    public static void FillColumn(int[][] arr, int colNum) {
        for(int i = 0; i < 5; i++) {
            arr[i][colNum] = 1;
        }

        printTwoDimArr(arr);
    }
    public static void printTwoDimArr(int[][] arr) {
        for(int i = 0; i < 5; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("-----------");
    }
    public static void main(String[] args) {
        int[][] arr = new int[5][5];

        System.out.println("가로 한 줄 채우기");
        FillRow(arr, 2);

        System.out.println("세로 한 줄 채우기");
        FillColumn(arr, 2);
    }
}
