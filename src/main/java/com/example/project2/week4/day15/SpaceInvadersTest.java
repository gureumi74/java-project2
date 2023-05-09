package com.example.project2.week4.day15;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders(); // SpaceInvaders 클래스 인스턴스화
        si.moveLeft(); // moveLeft() 메소드 실행
        si.moveRight(); // moveRight() 메소드 실행
        System.out.println(si.location); // location 멤버 변수 출력
    }
}
