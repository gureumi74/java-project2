package com.example.project2.codeup.num1071to1092;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int lowPixel = Integer.parseInt(st.nextToken());
        int columnPixel = Integer.parseInt(st.nextToken());
        int bit = Integer.parseInt(st.nextToken());
        double answer = (long)(lowPixel * columnPixel * bit) / 8388608.0;
        bw.write(String.format("%.2f MB", answer));
        bw.close();
    }
}
