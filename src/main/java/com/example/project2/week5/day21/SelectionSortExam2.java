package com.example.project2.week5.day21;

import java.util.Arrays;

public class SelectionSortExam2 {
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9, 28, 11};

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

//        int targetValue = arr[0];
//        int targetIdx = 0;
//        for(int i = 0; i < arr.length; i++) {
//            if(targetValue > arr[i]) {
//                targetValue = arr[i];
//                targetIdx = i;
//            }
//        }
//        int tmp = arr[0];
//        arr[0] = arr[targetIdx];
//        arr[targetIdx] = tmp;

        System.out.println(Arrays.toString(arr));
    }
}
