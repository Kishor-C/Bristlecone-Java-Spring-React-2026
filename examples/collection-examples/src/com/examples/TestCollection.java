package com.examples;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollection {
	public static void main(String[] args) {
		//List<String> names = new ArrayList<String>();
		List<String> names = new LinkedList<String>();
		//adding some strings
		names.add("Java");
		names.add("React");
		names.add("Spring");
		names.add("Java");
		printElements(names); // printElements(List<String>)
		// remove some elements
		names.remove("Java"); // removes the elements Java
		printElements(names); // printElements(List<String>)
		names.remove(0); // removes the elements at index 0
		printElements(names);	
		// add elements at specific index - add(int, T)
		names.add(1, "Angular");
		names.add(2, "HTML");
		printElements(names);
		// modify the elements based on the index - set(int, T)
		names.set(1, "Angular20");
		printElements(names);
	}
	
	public static void printElements(List<String> list) {
		System.out.println("Size of the list: "+list.size());
		for(String item : list) {
			System.out.println(item);
		}
		System.out.println("------------------");
	}
}
