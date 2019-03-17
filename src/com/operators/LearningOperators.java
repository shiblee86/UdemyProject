package com.operators;

public class LearningOperators {

	public static void main(String[] args) {

		int result = 1 + 2;
		result = result + 5;

		System.out.println(result);

		result *= 10;
		result++;
		result += 2;
		System.out.println(result);

		double d = (double) result % 3;

		System.out.println(d);

		boolean isAlien = false;

		if (isAlien == true) {
			System.out.println("It not an Alien");
		} else {
			System.out.println("NOT!");
		}

		int topScore = 100;
		int lowScore = 65;
		if (topScore != 101) {
			System.out.println("Top score is 100");
		} else {
			System.out.println("False");
		}

		int newTopScore = 90;
		if (newTopScore > 80 && newTopScore < 90) {
			System.out.println("The grade is B+");
		}

		if (topScore > 100 || topScore < 100) {
			System.out.println("Top Score Prints");
		}

		int newValue = 50;
		if (newValue == 50) {
			System.out.println("Value is 50");
		}

		boolean isCar = false;
		if (isCar == false) {
			System.out.println("Print " + isCar);
		}

		boolean wasCar = isCar;
		System.out.println(wasCar);

		int income = 4000;
		int expense = 4500;
		int savings = income - expense;

		String test = (savings > expense) ? "We saved money $ " + savings : "We did not save money $ " + savings;
		System.out.println(test);
		
		double syed = 20.00;
		double tuni = 80;
		
		double mult = (syed + tuni) * 25;
		System.out.println(mult);
		
		double rem = mult % 40;
		System.out.println(rem);
		
		String newTest = (rem <= 20.00) ? "Total was over the limit " + rem : "Total was NOT over the limit " + rem;
		System.out.println(newTest);

	}

}
