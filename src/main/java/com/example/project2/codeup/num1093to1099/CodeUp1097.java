package com.example.project2.codeup.num1093to1099;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1097 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] checkerboard = new int[19][19];
        for(int i = 0; i < 19; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 19; j++) {
                checkerboard[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int inputNum = Integer.parseInt(br.readLine());
        for(int i = 0; i < inputNum; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()) - 1;
            int y = Integer.parseInt(st.nextToken()) - 1;
            for(int j = 0; j < 19; j++) {
                checkerboard[x][j] = checkerboard[x][j] == 1 ? 0 : 1;
                checkerboard[j][y] = checkerboard[j][y] == 1 ? 0 : 1;

            }
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
