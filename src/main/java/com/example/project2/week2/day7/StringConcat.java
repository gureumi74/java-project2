package com.example.project2.week2.day7;

public class StringConcat {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";

        System.out.println(s1 + s2);
        System.out.println(s1 + " " + s2);
        System.out.println("1" + 1); // int -> Widening Casting 캐스팅 된다

        String name = "김하늘";
        int balance = 10000;
        String message = name + "님의 통장 잔고는 " + balance + "원입니다.";
        System.out.println(message);

        //String 포맷팅 방법
        String result = String.format("%s님의 통장 잔고는 %d원입니다.", name, balance);
        System.out.println(result);
    }
}
