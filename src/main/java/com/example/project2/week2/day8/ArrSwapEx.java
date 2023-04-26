package com.example.project2.week2.day8;

import java.util.Arrays;

public class ArrSwapEx {
    public static void swap(int[] arr, int numIdx1, int numIdx2) {
        int temp = arr[numIdx1];
        arr[numIdx1] = arr[numIdx2];
        arr[numIdx2] = temp;

        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 8, 7, 6};

        System.out.println("변경 전");
        System.out.println(Arrays.toString(arr));
        System.out.println("변경 후");
        swap(arr, 0, 1);
    }
}
