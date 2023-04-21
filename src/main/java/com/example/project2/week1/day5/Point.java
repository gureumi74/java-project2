package com.example.project2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        return x == y;
    }

    double getDistance(Point p) {
        // 두 점 사이의 거리 구하기
        int pX = p.x - this.x;
        int pY = p.y - this.y;

        double distance = Math.sqrt(Math.pow(pX, 2) + Math.pow(pY, 2));
        return distance;
    }
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);
    }

}
