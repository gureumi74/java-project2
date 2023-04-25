package com.example.project2.week2.day7;

import java.util.Arrays;

public class ArrayDefineAndPrint {
    public static void main(String[] args) {
        int[] iArr = new int[5];
        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 7;
//        for(int i = 0; i < iArr.length; i++) {
//            System.out.println(iArr[i]);
//        }

        int[] iArr2 = new int[]{1, 2, 3, 8};
        String[] sArr = new String[3];

        // 배열 출력하는법
        System.out.println(Arrays.toString(iArr));
        System.out.println(Arrays.toString(iArr2));
        System.out.println(Arrays.toString(sArr));
    }
}
