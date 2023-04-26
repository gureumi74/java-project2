package com.example.project2.week2.day8;

public class LikeAccumulate {
    public static void main(String[] args) {
        int likeCount = 0;
        for(int i = 1; i < 4; i++) {
            likeCount += 1;
            System.out.println(likeCount);
        }

        int myAccount = 1_000_000;
        myAccount -= 500_000;
        System.out.println(myAccount);
        myAccount += 4_000_000;
        System.out.println(myAccount);
    }
}
