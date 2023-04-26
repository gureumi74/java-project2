package com.example.project2.week2.day8;

public class ClassInSchoolTest {
    public static void main(String[] args) {
        ClassInSchool classInSchool1 = new ClassInSchool();
        classInSchool1.no = 1;
        classInSchool1.teacher = new Teacher();
        classInSchool1.teacher.name = "김하늘";
        classInSchool1.teacher.address = "서울시 강서구";
        classInSchool1.students = new Student[30];

        System.out.println(classInSchool1.teacher.name);
        System.out.printf("%d반 담임 선생님 성합은 %s입니다.\n", classInSchool1.no, classInSchool1.teacher.name);



    }
}
