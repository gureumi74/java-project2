package com.example.project2.week2.day8;

import java.util.Arrays;

public class ArrayDefineAndAssign {
    public static void main(String[] args) {
        int[][] arr2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        for(int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr2[i]));
        }

        int[][] arr = new int[3][3];
        int[] arr0 = arr[0];
        arr0[0] = 1;
        System.out.println("2차원 배열 접근 후 출력");
        for(int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        arr[0][0] = 1;
        arr[1][0] = 2;
        arr[0][2] = 3;
        System.out.println("2차원 배열 직접적으로 접근");
        for(int i = 0; i < 3; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
