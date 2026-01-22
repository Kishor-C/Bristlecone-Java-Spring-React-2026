package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTODOTasks {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		List<String> tasks = new ArrayList<>();
		do {
			System.out.println("Enter tasks: 1: Add 2: Remove 3: Update 4: Display 5: Exit");
			option = Integer.parseInt(scan.nextLine());
			switch(option) {
			case 1: {
				System.out.println("Enter task");
				String task = scan.nextLine();
				tasks.add(task);
				break;
			}
			case 2: {
				System.out.println("Enter index to remove the task");
				int index = Integer.parseInt(scan.nextLine());
				if(index >= tasks.size()) {
					System.out.println("Invalid index");
					continue;
				} else {
					tasks.remove(index);
					System.out.println("Task at "+index+" index is removed");
				}
				break;
			}
			case 3: {
				System.out.println("Enter index to update the task");
				int index = Integer.parseInt(scan.nextLine());
				if(index >= tasks.size()) {
					System.out.println("Invalid index");
					continue;
				} else {
					tasks.set(index, tasks.get(index) + " [COMPLETED]");
					System.out.println("Task COMPLETD!");
				}
				break;
			}
			case 4: {
				for(String task : tasks) {
					System.out.println(task);
				}
				break;
			}
			
			}
		} while(option != 5);
		System.out.println("Thank you");
	}
}
