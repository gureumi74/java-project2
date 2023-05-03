package com.example.project2.codeup.num1093to1099;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNum = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = 23;
        for(int i = 0; i < inputNum; i++) {
            int n = Integer.parseInt(st.nextToken());
            min = n < min ? n : min;
        }

        bw.write(String.valueOf(min));
        bw.close();
    }
}
