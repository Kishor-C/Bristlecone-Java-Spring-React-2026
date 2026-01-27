package com.examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestProductsCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// creating a immutable products that can't be changed
		List<Product> productsList = List.of(
				new Product(100, "Laptop", 56000),
				new Product(101, "Mobile", 16000),
				new Product(102, "Chairs", 5000),
				new Product(103, "TV", 80000),
				new Product(104, "Mic", 26000),
				new Product(105, "Shoes", 6000));
		int choice = 0;
		// create an empty array list to maintain the products like cart
		List<Product> cart = new ArrayList<Product>();
		do {
			System.out.println("************ List of Products ************");
			for(Product product : productsList) {
				System.out.println(product);
			}
			System.out.println("Choose your options:-");
			System.out.println("1: Add 2: Remove 3: Display 4: Clear 5: Exit");
			choice = Integer.parseInt(sc.nextLine());
			switch(choice) {
			case 1 : { 
				System.out.println("Enter name:-");
				String name = sc.nextLine();
				for(Product p : productsList) {
					String productName = p.getName();
					if(name.equalsIgnoreCase(productName)) {
						// take the product and add to the list
						Product product = new Product(p.getId(), p.getName(), p.getPrice());
						// we are doing this so that original product in the list wouldn't be added in the cart
						cart.add(product); 
						System.out.println(name+" is added to the cart!!!");
					} 
				}
				break; 
			}
			case 2 : { 
				// you need to remove from the cart by asking the product name
				break;
			}
			case 3: {
				// display the total price of the products selected in the cart
				double total = 0;
				System.out.println("*** List of products selected ****");
				for(Product p : cart) {
					double price = p.getPrice();
					total = price + total;
					System.out.println(p);
				}
				System.out.println("********************************************");
				System.out.println("Total price = "+total);
				System.out.println("********************************************");
				break;
				
			}
			case 4: {
				// clear all the products in the cart
				cart.clear();
				System.out.println("Cart is cleared and it has "+cart.size()+" products");
				break;
			}
			}
		} while(choice != 5);
		System.out.println("Thank you!");
	}

}
