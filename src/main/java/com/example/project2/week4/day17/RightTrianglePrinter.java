package com.example.project2.week4.day17;

import java.io.IOException;

public class RightTrianglePrinter {
    private Printer printer;

    public RightTrianglePrinter(Printer printer) {
        this.printer = printer;
    }

    public String makeALine(int h, int i) {
        return String.format("%s%s\n",  "", "*".repeat(i));
    }

    // 모양 출력하기
    public void printShape(int height) throws IOException {
        String[] lines = new String[height];
        for(int i = 0; i < height; i++) {
            lines[i] = makeALine(height, i + 1);
        }
        printer.print(lines);
    }

    public static void main(String[] args) {
        RightTrianglePrinter rtp = new RightTrianglePrinter(new FilePrinter());

    }
}
