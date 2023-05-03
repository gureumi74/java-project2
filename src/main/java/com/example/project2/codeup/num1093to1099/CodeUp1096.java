package com.example.project2.codeup.num1093to1099;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1096 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int inputNum = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] checkerboard = new int[19][19];
        for(int i = 0; i < inputNum; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            checkerboard[x][y] = 1;
        }
        for(int i = 0; i < 19; i++) {
            for (int j = 0; j < 19; j++) {
                bw.write(String.format("%d ", checkerboard[i][j]));
            }
            bw.write("\n");
        }
        bw.close();
    }
}
