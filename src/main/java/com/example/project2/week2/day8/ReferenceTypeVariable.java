package com.example.project2.week2.day8;

import java.util.Arrays;

public class ReferenceTypeVariable {
    public static void main(String[] args) {
        Student student = new Student();
        Student[] students = new Student[2];
        students[0] = new Student();
        students[0].name = "김하늘";
        students[0].phoneNumber = "010-8298-0000";
        students[0].age = 25;

        students[1] = new Student();
        students[1].name = "김멋사";
        students[1].phoneNumber = "010-1234-5678";
        students[1].age = 27;

        for(int i = 0; i < 2; i++) {
            System.out.println(students[i].name);
            System.out.println(students[i].phoneNumber);
            System.out.println(students[i].age);
        }
    }
}
