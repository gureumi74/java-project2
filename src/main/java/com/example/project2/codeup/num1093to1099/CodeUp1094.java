package com.example.project2.codeup.num1093to1099;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp1094 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] attendance = new int[inputNum];
        for(int i = inputNum - 1; i >= 0; i--) {
            attendance[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < inputNum; i++) {
            bw.write(String.format("%d ", attendance[i]));
        }
        bw.close();
    }
}
