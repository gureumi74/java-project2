package com.example.project2.week3.day12;

import java.util.Arrays;

public class Programmers2 {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for(int i = 0; i < queries.length; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = queries[i][0]; j <= queries[i][1]; j++) {
                if(queries[i][2] < arr[j]) {
                    min = min < arr[j] ? min : arr[j];
                }
            }
            if (min == Integer.MAX_VALUE) {
                min = -1;
            }
            answer[i] = min;
        }
        return answer;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 4, 3};
        int[][] queries = {{0, 4, 2}, {0, 3, 2}, {0, 2, 2}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
