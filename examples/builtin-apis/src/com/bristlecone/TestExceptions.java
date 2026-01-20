package com.bristlecone;

import java.util.Scanner;

public class TestExceptions {
	public static void findElement(int index) {
		int[] items = {20, 30, 40, 10, 50};
		try {
			System.out.println("Item is : "+items[index]);
			System.out.println("Item found at "+index);
			int x = items[index] / index;
			System.out.println("x = "+x);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOBE");
		} catch(ArithmeticException e) {
			System.out.println("AE");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("end of findElement");
		
	}
	public static void main(String[] args) {
		System.out.println("main method starts...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter position of the element:-");
		int index = sc.nextInt();
		findElement(index);
		System.out.println("main method ends...");
	}
}
