package com.example.project2.week4.day18;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User(); // user1 객체 생성
        user1.setName("김미미"); // user1 이름(속성) 값 할당
        user1.setAge(14); // user1 나이(속성) 값 할당

        User user2 = new User();// user2 객체 생성
        user2.setName("김나나"); // user2 속성 값 할당
        user2.setAge(37); // user2 속성 값 할당

        System.out.printf("%s는 성인입니까? : %s\n", user1.getName(), user1.isAdult());
        System.out.printf("%s는 성인입니까? : %s\n", user2.getName(), user2.isAdult());
    }
}
