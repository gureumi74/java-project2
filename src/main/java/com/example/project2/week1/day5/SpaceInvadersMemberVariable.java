package com.example.project2.week1.day5;

public class SpaceInvadersMemberVariable {
    int location; // 멤버 변수
    public void moveLeft() {
        location -= 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    public void moveRight() {
        location += 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();



    }

}
