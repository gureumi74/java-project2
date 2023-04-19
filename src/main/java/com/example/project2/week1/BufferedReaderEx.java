package com.example.project2.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
    public void readALine() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        // 한 줄 출력
//        String line = br.readLine();
//        System.out.println(line);
        // 또는 Syster.out.println(br.readLine());

        // 두 줄 출력
        System.out.println(br.readLine());
        System.out.println(br.readLine());
    }
}
