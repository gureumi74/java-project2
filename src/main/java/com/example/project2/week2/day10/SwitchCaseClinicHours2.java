package com.example.project2.week2.day10;

public class SwitchCaseClinicHours2 {
    public static void main(String[] args) {
        String day = "금";
        String time = "";
        String lunch = "13:00 - 14:00";
        switch (day) {
            case "월", "화", "목", "금" : time = "09:00 - 21:00"; break;
            case "토", "일" : time = "09:00 - 16:00"; break;
        }
        System.out.printf("%s요일 진료 시간은 %s, 휴게시간은 %s입니다.\n", day, time, lunch);
    }
}
