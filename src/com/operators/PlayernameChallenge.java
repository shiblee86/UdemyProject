package com.operators;

public class PlayernameChallenge {

    static int position;

    public static void displayHighScorePosition(String name, int position){

        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){

        if(score >= 1000){
            return position = 1;
        }else if(score >= 500 && score <= 1000){
            return position = 2;
        }else if(score >= 100 && score <= 500){
            return position = 3;
        }else{
            return position = 4;
        }
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

        // int highScore = getFinalScore(true, 800, 5, 100);
        // System.out.println(highScore);
    }
}
