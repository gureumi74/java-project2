package com.example.project2.week1;

import java.io.IOException;
import java.io.InputStreamReader;

public class JavaInput {
    public void readAChar() throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        System.out.println(is.read()); // 한글자씩 읽어옴
    }

    public void readTwoChars() throws IOException {
        // InputStreamReader 선언하면서 인스턴스화
        InputStreamReader is = new InputStreamReader(System.in);

        // 총 두 글자 읽어서 코드 출력
        System.out.println(is.read());
        System.out.println(is.read());
    }
}
