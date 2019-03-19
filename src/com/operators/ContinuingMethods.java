package com.operators;

public class ContinuingMethods {

   static int position;

    public static int getFinalScore(boolean gameOver, int score, int levelCompleted, int bonus){

        System.out.println("\n\tgetFinalScore Method");
        System.out.println("************************");

        int finalScore;
        if(gameOver){
            finalScore = score + (levelCompleted * bonus) + 2000;
            System.out.println("Your Final score was " + finalScore);
            return finalScore;
        }
        return -1;
        /* having -1 returned means there is an error.*/

    }
    /* Procdure means a method void*/
    public static void displayHighScorePosition(String name, int position){

        System.out.println(name + " managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){

        if(score > 1000){
            return position = 1;
        }else if(score > 500 && score < 1000){
            return position = 2;
        }else if(score > 100 && score < 500){
            return position = 3;
        }else{
            return position = 4;
        }
    }

    public static void main(String[] args) {

        calculateHighScorePosition(1500);
        displayHighScorePosition("Syed", position);

        calculateHighScorePosition(900);
        displayHighScorePosition("Tuni", position);

        calculateHighScorePosition(400);
        displayHighScorePosition("Syed", position);

        calculateHighScorePosition(50);
        displayHighScorePosition("Syed", position);

       // int highScore = getFinalScore(true, 800, 5, 100);
       // System.out.println(highScore);
    }
}
