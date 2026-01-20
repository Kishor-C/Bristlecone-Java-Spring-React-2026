package com.bristlecone;

import java.util.Scanner;

public class TestWrappers {
	public static void main(String[] args) {
		// comparing 2 int's
		System.out.println("20, 30: "+Integer.compare(20, 30));
		System.out.println("30, 20: "+Integer.compare(30, 20));
		System.out.println("30, 30: "+Integer.compare(30, 30));
		
		System.out.println("30.0, 35.0: "+Double.compare(30.0, 35.0));
		Scanner sc = new Scanner(System.in);
		// think that we are reading a number in text format
		System.out.println("Enter a number");
		String num = sc.next();
		int intValue = Integer.parseInt(num);
		System.out.println("Int value + 50: "+(intValue+50));
		System.out.println("String value + 50: "+(num+50));
		//Some static methods in Integer that converts to other formats
		System.out.println("Hexademial value of 15: "+Integer.toHexString(15));
		System.out.println("Binary value of 15: "+Integer.toBinaryString(15));
	}
}
