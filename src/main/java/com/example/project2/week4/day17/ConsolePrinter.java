package com.example.project2.week4.day17;

import java.io.IOException;

public class ConsolePrinter implements Printer {
    @Override
    public void print(String[] lines) throws IOException {
        for(int i = 0; i < lines.length; i++) {
            System.out.println(lines[i]);
        }
    }
}
