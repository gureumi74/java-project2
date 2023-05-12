package com.example.project2.week4.day19;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public interface LineReader {
    List<String> getLines(String fileName, Charset charset) throws IOException;
}
