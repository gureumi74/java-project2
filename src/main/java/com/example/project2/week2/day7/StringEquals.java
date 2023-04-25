package com.example.project2.week2.day7;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD"); // TRUE

        String str1 = "GOLD";
        String str2 = "G";
        System.out.println(str1.substring(0, 1) == str2);
        System.out.println("GOLD-->" + str1.hashCode());
        System.out.println("G-->" + str2.hashCode());

        // 자바에서는 == 로 비겨연산을 할 땐 Hash값(특정위치-주소)주소가 달라서 false

        System.out.println(str1.substring(0, 1).equals(str2));
    }
}
