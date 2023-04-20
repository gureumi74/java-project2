package com.example.project2.week1.day4;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintfDate {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(new Date());
        System.out.println(date);

    }
}
