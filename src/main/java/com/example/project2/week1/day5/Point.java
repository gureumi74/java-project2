package com.example.project2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        return x == y;
    }

    float getDistance(Point p) {
        // 두 점 사이의 거리 구하기
        int xD = p.x - this.x;
        int yD = p.y - this.y;

        return xD;
    }

    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }

}
