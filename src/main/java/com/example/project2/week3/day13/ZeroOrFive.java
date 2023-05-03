package com.example.project2.week3.day13;

import java.util.ArrayList;
import java.util.List;

public class ZeroOrFive {
    public static void main(String[] args) {
        int startNum = 5;
        int endNum = 5000;
        List list = new ArrayList();
        for(int i = startNum; i <= endNum; i++) {
            int check = solution(i);
            if(check != 0) {
                list.add(check);
            }
        }

        System.out.println(list);

    }
    public static int solution(int num) {
        int checkNum = num;
        boolean flag = true;
        while (checkNum > 0) {
            if (checkNum % 10 != 5 && checkNum % 10 != 0) {
                flag = false;
                break;
            }
            checkNum /= 10;
        }
        return flag ? num : 0;
    }
}
