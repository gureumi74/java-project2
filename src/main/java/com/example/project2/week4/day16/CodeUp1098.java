package com.example.project2.week4.day16;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1098 {
    private int[][] arr;
    public CodeUp1098(int height, int wide) {
        this.arr = new int[height][wide];
    }
    public void solution(int len, int dir, int x, int y) {

        if (dir == 0) {
            for(int i = 0; i < len; i++) {
                arr[x - 1][y - 1 + i] = 1;
            }
        } else {
            for(int i = 0; i < len; i++) {
                arr[x - 1 + i][y - 1] = 1;
            }
        }
    }
    public void printArr() {
        for(int i = 0; i < this.arr.length; i++) {
            for(int j = 0; j < this.arr[i].length; j++) {
                System.out.print(this.arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int wide = Integer.parseInt(st.nextToken());
        CodeUp1098 cu = new CodeUp1098(height, wide);

        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i < num; i++) {
            st = new StringTokenizer(br.readLine());
            int len = Integer.parseInt(st.nextToken());
            int dir = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            cu.solution(len, dir, x, y);
        }
        cu.printArr();
    }
}
