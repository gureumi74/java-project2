package com.example.project2.week4.day17;

import java.io.IOException;

public class HelloPrinter {
    // 파일에도 저장하고 싶고 콘솔에도 출력하고 싶다.
    // 인터페이스 생성 후 기능을 구현하는 클래스 연결
    Printer2 printer;

    // Alt + insert로 만듬 생성자로 바꾸고 메인에서 호출할 때 넣어주면 됨
    // di 받도록 구조 변경
    public HelloPrinter(Printer2 printer) {
        this.printer = printer;
    }

    public void repeatMessage(int n, String message) throws IOException {
        // 기능1 반복하는 기능 추가
        // printConsole을 건드리지 않고 새로운 기능을 추가하고 싶음
        for (int i = 0; i < n; i++) {
            // 단순히 호출을 할 뿐
            printer.print(message);
        }
    }
    public static void main(String[] args) throws IOException {
        HelloPrinter hp = new HelloPrinter(new FilePrinter2());
        hp.repeatMessage(5, "Hello");
    }
}
