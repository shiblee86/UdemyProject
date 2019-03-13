package com.stringpractice;

public class StringClass {

	public static void main(String[] args) {

		String myString = "This is a string";

		System.out.println(myString);

		myString = myString + " and this is more";

		System.out.println(myString);

		String numberString = "250.55";

		// numberString = numberString + "49.95";

		System.out.println(numberString);

		double d = Double.valueOf(numberString);

		double e = Double.parseDouble(numberString);

		System.out.println(e);
//
//		double b = Double.parseDouble(numberString);
//
//		System.out.println(a);
//
//		System.out.println(b);
	}

}
