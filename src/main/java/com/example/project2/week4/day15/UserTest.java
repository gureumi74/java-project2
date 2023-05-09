package com.example.project2.week4.day15;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User(); // user1 객체 생성
        user1.name = "김미미"; // user1 이름(속성) 값 할당
        user1.age = 14; // user1 나이(속성) 값 할당

        User user2 = new User(); // user2 객체 생성
        user2.name = "김나나"; // user2 속성 값 할당
        user2.age = 37; // user2 속성 값 할당

        System.out.printf("%s는 성인입니까? : %s\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인입니까? : %s\n", user2.name, user2.isAdult());
    }
}
