package com.example.project2.week3.day12;

import java.util.Arrays;

public class Programmers3 {
    public static int[] solution(int[] arr, int[][] queries) {
        // 수열과 구간 쿼리 3
        for(int i = 0; i < queries.length; i++) {
            int tmp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = tmp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4};
        int[][] queries = {{0, 3}, {1, 2}, {1, 4}};
        System.out.println(Arrays.toString(solution(arr, queries)));
    }
}
