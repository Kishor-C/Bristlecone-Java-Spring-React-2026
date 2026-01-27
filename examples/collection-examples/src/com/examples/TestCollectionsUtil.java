package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollectionsUtil {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		List<Integer> numbers = new ArrayList<>();
		// adding strings
		names.add("Zaheer");	names.add("Sachin");	names.add("Yuvraj");
		names.add("Virat");		names.add("Rohit");		names.add("Dhoni");
		// adding numbers
		numbers.add(5);		numbers.add(10);	numbers.add(20);	
		numbers.add(15);	numbers.add(2);		numbers.add(4);		
		printStringElements(names);
		Collections.sort(names);
		printStringElements(names);
		printIntElements(numbers);
		// sorting numbers
		Collections.sort(numbers);
		printIntElements(numbers);
		// finding the max or min
		System.out.println("Min: "+Collections.min(numbers)+", Max: "+Collections.max(numbers));
	}
	public static void printIntElements(List<Integer> items) {
		System.out.println("***** Integer Elements ******");
		for(int item : items) {
			System.out.println(item);
		}
		System.out.println("__________________________");
	}
	public static void printStringElements(List<String> items) {
		System.out.println("***** String Elements ******");
		for(String item : items) {
			System.out.println(item);
		}
		System.out.println("__________________________");
	}
}
