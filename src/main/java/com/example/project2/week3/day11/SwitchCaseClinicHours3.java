package com.example.project2.week3.day11;

public class SwitchCaseClinicHours3 {
    public static void main(String[] args) {
        String day = "화";
        String time = switch (day) {
            case "월", "화", "목", "금" -> "09:30 - 18:30";
            case "토" -> "09:30 - 13:00";
            case "수", "일" -> "휴진";
            default -> throw new IllegalStateException("Unexpected value: " + day);
        };

        System.out.printf("%s요일은 %s입니다.\n", day, time);
    }
}
