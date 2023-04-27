package com.example.project2.codeup.num1071to1092;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1089 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int startNum = Integer.parseInt(st.nextToken());
        int plusNum = Integer.parseInt(st.nextToken());
        int countNum = Integer.parseInt(st.nextToken());

        bw.write(String.format("%d", plusNum * (countNum - 1) + startNum));
        bw.close();
    }
}
