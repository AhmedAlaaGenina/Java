package com.company;

public class Main {

    public static void main(String[] args) {
        int score = position(1500);
        displayHighScorePosition("Ahmed", score);
        score = position(900);
        displayHighScorePosition("Ahmed", score);
        score = position(400);
        displayHighScorePosition("Ahmed", score);
        score = position(50);
        displayHighScorePosition("Ahmed", score);
    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get position " +
                position + " on the high Score table ");
    }

    public static int position(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
