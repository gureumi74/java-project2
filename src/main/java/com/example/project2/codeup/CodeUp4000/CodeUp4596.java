package com.example.project2.codeup.CodeUp4000;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp4596 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int max = 0;
        int maxXIdx = 0;
        int maxYIdx = 0;
        for(int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num > max) {
                    max = num;
                    maxXIdx = i + 1;
                    maxYIdx = j + 1;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(maxXIdx + " " + maxYIdx);
        bw.close();
    }
}
