package com.example.project2.week4.day15;

public class SpaceInvaders {
    int location; // 멤버 변수 선언

    // 왼쪽으로 이동하는 메소드
    public void moveLeft() {
        location = location - 1;
    }

    // 오른쪽으로 이동하는 메소드
    public void moveRight() {
        location = location + 1;
    }
}

