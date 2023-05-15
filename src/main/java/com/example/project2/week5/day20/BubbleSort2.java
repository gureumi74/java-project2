package com.example.project2.week5.day20;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BubbleSort2 {
    public int[] sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        int[] arr = {7, 2, 3, 9, 28, 1};
        BubbleSort2 bubbleSort2 = new BubbleSort2();
        System.out.println(Arrays.toString(bubbleSort2.sort(arr)));
    }
}
