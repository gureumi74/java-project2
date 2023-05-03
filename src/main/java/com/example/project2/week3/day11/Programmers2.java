package com.example.project2.week3.day11;

import java.util.ArrayList;
import java.util.List;

public class Programmers2 {
    public static int[] solution(int l, int r) {
        // int로만 해보기
        List list = new ArrayList();
        for(int i = l; i <= r; i++) {
            int num = i;
            boolean flag = true;
            while (num > 0) {
                int check = num % 10;
                if(check != 0 && check != 5) {
                    flag = false;
                    break;
                }
                num /= 10;
            }

            if(flag) {
                list.add(i);
            }
        }
        if(list.size() == 0) {
            list.add(-1);
        }
        return list.stream().mapToInt(x -> (int) x).toArray();
    }
    public static void main(String[] args) {
        int l = 5;
        int r = 555;
        System.out.println(solution(l, r));

    }
}
