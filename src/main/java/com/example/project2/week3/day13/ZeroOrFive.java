package com.example.project2.week3.day13;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroOrFive {
    public static void main(String[] args) {
        int startNum = 5;
        int endNum = 5000;
        List list = new ArrayList();
        int[] answer = {};
        for(int i = startNum; i <= endNum; i++) {
            int check = i;
            boolean flag = true;
            while (check > 0) {
                if (check % 10 != 5 && check % 10 != 0) {
                    flag = false;
                    break;
                }
                check /= 10;
            }
            if(flag) {
                list.add(i);
            }
        }

        answer = list.stream().mapToInt(x -> (int) x).toArray();

        System.out.println(Arrays.toString(answer));
    }
}
