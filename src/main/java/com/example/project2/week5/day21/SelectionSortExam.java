package com.example.project2.week5.day21;

import java.util.Arrays;

public class SelectionSortExam {
    public int[] sort(int[] arr, boolean isAscending) {
        for(int i = 1; i < arr.length; i++) {
            for(int j = i; j > 0; j--) {
                if(isAscending ? arr[j] < arr[j - 1] : arr[j] > arr[j - 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = tmp;
                } else break;
            }
        }
        return arr;
    }
    public int[] sort(int[] arr) {
        return sort(arr, true);
    }
    public char[] sort(char[] arr) {
        int[] intArr = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            intArr[i] = arr[i];
        }

        intArr = sort(intArr, true);
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (char) intArr[i];
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 9, 11, 28};
        char[] arr2 = {'a', 't', 'p', 'z', 'c'};

        SelectionSortExam selectionSortExam = new SelectionSortExam();
        System.out.println(Arrays.toString(selectionSortExam.sort(arr, false)));
        System.out.println(Arrays.toString(selectionSortExam.sort(arr2)));
    }
}
