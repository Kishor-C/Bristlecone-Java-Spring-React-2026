package com.bristlestone;

public class TestWrapper {
	public static void main(String[] args) {
		String s1 = "25";
		String s2 = "35";
		// Integer.parseInt converts string to int
		int num1 = Integer.parseInt(s1);
		int num2 = Integer.parseInt(s2);
		System.out.println(num1 + num2);
		// Integer.toHexString, Integer.toBinaryString, Integer.toOctalString
		System.out.println("Hexadecimal value of 13: "+Integer.toHexString(13));
		// comparing 2 ints - useful while sorting - they give -1, 0, +1
		System.out.println("Compare 20 and 30: "+Integer.compare(20, 30));
		System.out.println("Compare 30 and 20: "+Integer.compare(30, 20));
		System.out.println("Compare 20 and 20: "+Integer.compare(20, 20));
		// compare 2 doubles
		System.out.println("Compare 20.0 and 30.0: "+Double.compare(20.0, 30.0));
		// Character has methods to identify characters property - digit, letter
		System.out.println("Is 2 a digit: "+Character.isDigit('2'));
		System.out.println("Is Z a digit: "+Character.isDigit('Z'));
		System.out.println("Is Z a letter: "+Character.isLetter('Z'));
		// while validating the characters
		System.out.println("Alphabet: "+Character.isAlphabetic('A'));
		System.out.println("is letter: "+Character.isLetter('\u2170'));
		System.out.println("is alphabetic: "+Character.isAlphabetic('\u2170'));
	}
}
