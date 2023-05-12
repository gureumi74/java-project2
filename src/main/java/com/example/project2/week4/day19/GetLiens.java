package com.example.project2.week4.day19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.List;

public class GetLiens implements LineReader {
    @Override
    public List<String> getLines(String fileName, Charset charset) throws IOException {
        List<String> lines = new LinkedList<>();
        BufferedReader br = new BufferedReader(new FileReader(fileName, charset));
        // 인코딩 문제를 Charset.forName("EUC-KR")로 세팅하면 해결할 수 있다.


        String line;
        // 한 줄씩 읽어서 모두 읽어오는 것
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }
}
