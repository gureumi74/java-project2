package com.example.project2.week3.day13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

public class Programmers2 {
    public static void main(String[] args) {
        int n = 12;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 2; i <= n; i++) {
            while (n % i == 0) {
                set.add(i);
                n /= i;
            }
        }
        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());

        System.out.println(list);
    }
}
