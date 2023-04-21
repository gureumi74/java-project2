package com.example.project2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User Haneul = new User();
        Haneul.name = "김하늘";
        Haneul.phoneNum = "010-xxxx-xxxx";
        Haneul.age = 24;

        User Babo = new User();

        Babo.name = "이바보"; // 야 진짜 아니야~
        Babo.phoneNum = "010-1111-1111";
        Babo.age = 22;

        System.out.printf("%s님은 성인입니까? %s\n", Haneul.name, Haneul.isAdult());
        System.out.printf("%s님은 성인입니까? %s\n", Babo.name, Babo.isAdult());
    }
}
