package com.example.project2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read()); // 한글자씩 읽어옴
    }
}
