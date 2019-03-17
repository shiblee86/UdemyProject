package com.operators;

public class Ifkeyword {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Score is " + score);
        }
        System.out.println("This was executed");

        if (score <= 5000) {
            System.out.println("Score is less than " + score);
        } else if (score < 1000) {
            System.out.println("Got here");
        }

        if (gameOver == true) {
            /*
            We can also write the if(gameOver == true) as if(gameOver)
            We can create variable inside a code block
            * We cannot access variable inside code block from outside of the code block */
            int finalScore = score + (levelCompleted * bonus);
            //Variable inside a code black is called scope
            System.out.println("Your final score was " + finalScore);
        } else if (gameOver == true) {

            /*Will not print since gameOver == true is if*/
            score = 10000;
            levelCompleted = 8;
            bonus = 200;

            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your NEW NEW final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your new Final score was " + finalScore);
        }

        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (gameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your new Final score was " + finalScore);
        }


    }

}


