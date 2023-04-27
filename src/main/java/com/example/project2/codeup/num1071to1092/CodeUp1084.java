package com.example.project2.codeup.num1071to1092;

import java.io.*;
import java.util.StringTokenizer;

public class CodeUp1084 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int red = Integer.parseInt(st.nextToken());
        int green = Integer.parseInt(st.nextToken());
        int blue = Integer.parseInt(st.nextToken());
        int count = 0;

        for(int r = 0; r < red; r++) {
            for (int g = 0; g < green; g++) {
                for (int b = 0; b < blue; b++) {
                    String str = r + " " + g + " " + b + "\n";
                    bw.write(str);
                    count++;
                }
            }
        }
        bw.write(String.valueOf(count));
        bw.close();
    }
}
