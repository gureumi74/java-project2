package com.example.project2.week2.day10;

public class SwitchCaseSeason {
    public static void main(String[] args) {
        int month = 3;
        switch (month) {
            case 12, 1, 2: // month의 값이 12, 1, 2일 때 전부 동작
                System.out.println("겨울");
                break;
            case 3, 4, 5:
                System.out.println("봄");
                break;
            case 6, 7, 8:
                System.out.println("여름");
                break;
            case 9, 10, 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당하는 계절이 없습니다.");
        }
    }
}
