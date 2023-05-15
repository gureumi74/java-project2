package com.example.project2.week5.day20;

import java.util.Arrays;

public class BubbleSort {
    public int[] sort(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            // 배열의 두자리 크기를 비교해 자리 바꾸기
            sortARound(arr, i);
        }

        return arr;
    }
    public int[] sortARound(int[] arr, int until) {
        // 한개의 로직만 분리
        for (int j = 0; j < arr.length - until; j++) {
            // 배열의 두 자리를 비교하면서 작을경우 앞으로 바꾸기
            if (arr[j] > arr[j + 1]) {
                int tmp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = tmp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 1};

        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.sort(arr)));

    }
}
