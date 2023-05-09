package com.example.project2.week4.day15;

import java.util.Scanner;

public class CodeUp1671 {
    public String RockPaperScissors(int me, int computer) {
        switch (me - computer) {
            case 0 :
                return "tie";
            case -1, 2 :
                return "win";
            case 1, -2 :
                return "lose";
            default:
                break;
        }

        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int me = sc.nextInt();
        int computer = sc.nextInt();

        CodeUp1671 codeUp1671 = new CodeUp1671();
        System.out.println(codeUp1671.RockPaperScissors(me, computer));

    }
}
