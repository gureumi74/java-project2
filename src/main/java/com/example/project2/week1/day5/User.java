package com.example.project2.week1.day5;

public class User {
    // 이름, 전화번호 나이;
    String name;
    String phoneNum;
    int age;

    boolean isAdult() {
        // 성인 여부 확인
        return age >= 18;
    }
}
