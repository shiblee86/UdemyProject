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
		
		double d = (double) result%3;
		
		System.out.println(d);
		
boolean isAlien = false;

if(isAlien == true) {
	System.out.println("It not an Alien");
}else {
	System.out.println("NOT!");
}

int topScore = 100;
if(topScore != 101) {
	System.out.println("Top score is 100");
}else {
	System.out.println("False");
}

int newTopScore = 90;
if(newTopScore >80 && newTopScore <90) {
	System.out.println("The grade is B+");
}
		
	}

}
