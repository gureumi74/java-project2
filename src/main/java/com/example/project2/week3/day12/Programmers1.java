package com.example.project2.week3.day12;

import java.util.Arrays;

public class Programmers1 {
    public static int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) {
            answer[i][i] = 1;
        }
        return answer;
    }
    public static void main(String[] args) {
        int n = 3;
        int[][] answer = solution(n);
        for(int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(answer[i]));
        }
    }
}
