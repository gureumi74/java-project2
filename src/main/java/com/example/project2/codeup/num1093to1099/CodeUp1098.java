package com.example.project2.codeup.num1093to1099;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1098 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int length = Integer.parseInt(st.nextToken()); // 세로
        int width = Integer.parseInt(st.nextToken()); // 가로
        int barNum = Integer.parseInt(br.readLine()); // 막대의 개수
        int[][] checkerboard = new int[length][width];
        for(int i = 0; i < barNum; i++) {
            st = new StringTokenizer(br.readLine());
            int barLength = Integer.parseInt(st.nextToken()); // 바의 길이
            int direction = Integer.parseInt(st.nextToken()); // 0이면 가로, 1이면 세로 방향
            int x = Integer.parseInt(st.nextToken()) - 1; // 좌표 세로 위치
            int y = Integer.parseInt(st.nextToken()) - 1; // 좌표 가로 위치
            for(int j = 0; j < barLength; j++) {
                if (direction == 0) {
                    checkerboard[x][y + j] = 1;
                } else {
                    checkerboard[x + j][y] = 1;
                }
            }
        }

        for(int i = 0; i < length; i++) {
            for(int j = 0; j < width; j++) {
                bw.write(String.format("%d ", checkerboard[i][j]));
            }
            bw.write("\n");
        }
        bw.close();

    }
}
