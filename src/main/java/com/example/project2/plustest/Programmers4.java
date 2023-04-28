package com.example.project2.plustest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Programmers4 {
    public static int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];

        ArrayList<Integer> scoreCopy = new ArrayList<>();
        for(int i = 0; i < score.length; i++) {
            scoreCopy.add(score[i]);
            scoreCopy.sort(Comparator.reverseOrder());
            if(i < k) {
                answer[i] = scoreCopy.get(i);
            } else {
                answer[i] = scoreCopy.get(k - 1);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        int k = 4;
        int[] score = {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        int[] answer = solution(k, score);
        System.out.println(Arrays.toString(answer));
    }
}
