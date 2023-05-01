package com.example.project2.plustest;

public class Programmers6 {
    public static int solution(int[] num_list) {
        String odd = "";
        String even = "";

        for(int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            } else {
                odd += num_list[i];
            }
        }

        return Integer.parseInt(odd) + Integer.parseInt(even);
    }
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        System.out.println(solution(num_list));
    }
}
