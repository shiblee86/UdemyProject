package com.operators;

public class NewMethods {

    boolean gameOver;
    int score;
    int levelCompleted;
    int bonus;

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        System.out.println("\tCalculcateScore Method");
        System.out.println("************************");

        if (score < 5000 && score > 1000) {
            System.out.println("Score is " + score);
        }
        System.out.println("This was executed");

        if (score <= 5000) {
            System.out.println("Score is less than " + score);
        } else if (score < 1000) {
            System.out.println("Got here");
        }

    }

    public void calculateWithInstantVariable(boolean gameOver, int score, int levelCompleted, int bonus) {

        System.out.println("\tCalculateWithInstanceVariable Method");
        System.out.println("************************");
        this.gameOver = gameOver;
        this.score = score;
        this.levelCompleted = levelCompleted;
        this.bonus = bonus;

        if (score < 5000 && score > 1000) {
            System.out.println("Score is " + score);
        }
        System.out.println("This was executed");

        if (score <= 5000) {
            System.out.println("Score is less than " + score);
        } else if (score < 1000) {
            System.out.println("Got here");
        }

    }

    public void calculateWithOutInstanceVariable(boolean gameOver, int score, int levelCompleted, int bonus) {

        System.out.println("\tCalculateWithoutInstanceVariable Method");
        System.out.println("************************");

        if (score < 5000 && score > 1000) {
            System.out.println("Score is " + score);
        }
        System.out.println("This was executed");

        if (score <= 5000) {
            System.out.println("Score is less than " + score);
        } else if (score < 1000) {
            System.out.println("Got here");
        }

    }
    /* It a non-void message is used, the method signature must have the data type being returned. In our case it is int
    The method must also have a return statement. In our case we have to write return -1 at the end since return finalScore
    being returned depends on gameOver being true. Hence, we must have something being returned.
     */
    public static int getFinalScore(boolean gameOver, int score, int levelCompleted, int bonus){

        System.out.println("\n\tgetFinalScore Method");
        System.out.println("************************");

        int finalScore;
        if(gameOver){
            finalScore = score + (levelCompleted * bonus) + 2000;
            System.out.println("Your Final score was " + finalScore);
            return finalScore;
        }else{
            return -1;
        }

        /* having -1 returned means there is an error.*/

    }

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 700;
        int levelCompleted = 3;
        int bonus = 75;

        System.out.println("\tMain Method");
        System.out.println("************************");

        calculateScore(true, 800, 5, 100);

        NewMethods methods = new NewMethods();

        methods.calculateWithInstantVariable(true, 2000, 6, 150);

        methods.calculateWithOutInstanceVariable(true, 200, 2, 50);

        System.out.println("\tThe variable values are obtained from Main Method");
        calculateScore(gameOver, score, levelCompleted, bonus);

        methods.getFinalScore(true, 500, 2, 15);

        score = 50;
        levelCompleted = 1;
        bonus = 10;

        System.out.println("\tcalculateScore Mothod with score 500");
        calculateScore(true, score, levelCompleted, bonus);
    }
}
