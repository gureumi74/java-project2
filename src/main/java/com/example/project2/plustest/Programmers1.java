package com.example.project2.plustest;

public class Programmers1 {
    public static String[] arrMap(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            answer[i] = String.format("%" + n + "s", Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = answer[i].replaceAll("0", " ");
            answer[i] = answer[i].replaceAll("1", "#");

        }
        return answer;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = {46, 33, 33, 22, 31, 50};
        int[] arr2 = {27, 56, 19, 14, 14, 10};
        String[] answer = arrMap(n, arr1, arr2);

        for(int i = 0; i < n; i++) {
            System.out.println(answer[i]);
        }

    }
}
