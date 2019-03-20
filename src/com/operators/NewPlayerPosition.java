package com.operators;

public class NewPlayerPosition {

    static int position;

    public static void displayHighScorePosition(String name, int position) {

        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {

//        if(score >= 1000){
//            return position = 1;
//        }else if(score >= 500){
//            return position = 2;
//        }else if(score >= 100){
//            return position = 3;
//        }else{
//            return position = 4;
//        }
        position = 4;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            return position;
        }

        return -1;
    }

    public static void main(String[] args) {

        calculateHighScorePosition(1500);
        displayHighScorePosition("January", position);

        calculateHighScorePosition(900);
        displayHighScorePosition("February", position);

        calculateHighScorePosition(400);
        displayHighScorePosition("March", position);

        calculateHighScorePosition(50);
        displayHighScorePosition("April", position);

        calculateHighScorePosition(500);
        displayHighScorePosition("May", position);

        calculateHighScorePosition(1000);
        displayHighScorePosition("June", position);

        calculateHighScorePosition(100);
        displayHighScorePosition("July", position);

        // int highScore = getFinalScore(true, 800, 5, 100);
        // System.out.println(highScore);
    }
}
