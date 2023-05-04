package com.example.project2.codeup.num1093to1099;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1099 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] mazeBox = new int[10][10];
        for(int i = 0; i < 10; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 10; j++) {
                mazeBox[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int x = 1; // 첫 시작 부분의 x좌표
        int y = 1;  // 첫 시작 부분의 y좌표
        while (mazeBox[8][8] != 9) {
            if(mazeBox[x][y] == 2) {
                mazeBox[x][y] = 9;
                break;
            }

            mazeBox[x][y] = 9;
            if(mazeBox[x][y + 1] == 1) {
                if(mazeBox[x + 1][y] == 1) {
                    break;
                }
                x++;
            } else y++;
        }

        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                bw.write(String.format("%d ", mazeBox[i][j]));
            }
            bw.write("\n");
        }
        bw.close();
    }
}
