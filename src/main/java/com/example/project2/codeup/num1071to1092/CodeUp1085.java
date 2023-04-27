package com.example.project2.codeup.num1071to1092;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long hz = Integer.parseInt(st.nextToken());
        long bit = Integer.parseInt(st.nextToken());
        long channel = Integer.parseInt(st.nextToken());
        long second = Integer.parseInt(st.nextToken());
        double answer = (hz * bit * channel * second) / 8388608.0;
        bw.write(String.format("%.1f MB", answer));
        bw.close();
    }
}
