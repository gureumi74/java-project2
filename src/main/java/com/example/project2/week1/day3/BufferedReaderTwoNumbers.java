package com.example.project2.week1.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderTwoNumbers {
    public void plusTwoNums() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 와 동일

        // 값을 두 개 입력받아서 더하기
        System.out.println(br.readLine() + br.readLine());
    }

}
