package com.example.project2.week2.day10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AutoSwap {
    public static void main(String[] args) {
        // 오름차순 정렬
        int[] arr = {2, 1, 7, 9};
        boolean check = arr[0] > arr[1];
        // 나중에 loop 문을 돌리면 전체 오름차순 정렬을 할 수 있다.
        if(check) {
            int temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
