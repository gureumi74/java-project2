package com.example.project2.codeup.num1093to1099;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class CodeUp1093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] attendance = new int[23];
        for(int i = 0; i < inputNum; i++) {
            attendance[Integer.parseInt(st.nextToken()) - 1]++;
        }
        for(int i = 0; i < attendance.length; i++) {
            bw.write(String.format("%d ", attendance[i]));
        }
        bw.close();
    }
}
