package com.operators;

public class KeywordClass {

    public static void main(String[] args) {

        int i = 5;
        //false, true, null

        //Expressions: building blocks on java code --> anything that has value

        //a mile is equal to 1.609344 km

        //Expression componets are variables, values and operators. The data type and the semicolon are not part of the expression

        int mile = 100;
        double km = 1.609344;

        double oneHundredMiles = (mile * km);

        System.out.println(oneHundredMiles + " kilometers");

        //highScore = 50 is expression
        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
            //("This is an expression") is an expression.

        }

        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;

            /*Expression:
             * score = 100
             * score > 99
             * "You got the high score
             * score = 0*/

        }
        //Statement & White space and indenting
        int myVariable = 50;
        myVariable++;
        //Statement is the entire line --> int myVariable = 50;
        //Statements do not have to be in one line
        //Two statements can be on the same line
        //White space --> space between variable and operators
        //Method calls are also statements
        /* indentation
         * indent code to make it easier to read*/
    }
}
