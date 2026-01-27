package com.examples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCustomTypeSorting {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(777, "Laptop", 85000.0));
		products.add(new Product(555, "TV", 125000.0));
		products.add(new Product(666, "Mobile", 55000.0));
		products.add(new Product(222, "Camera", 165000.0));
		products.add(new Product(888, "Shoes", 5000.0));
		products.add(new Product(999, "Cooker", 2000.0));
		products.add(new Product(111, "Jacket", 2500.0));
		printProducts(products);
		Collections.sort(products); // newId - sortedId -> 555, 666, 777
		printProducts(products);
	}
	public static void printProducts(List<Product> list) {
		System.out.println("*************List of Products********************");
		for(Product product : list) {
			System.out.println(product);
		}
		System.out.println("______________________________________________________");
	}
	
}
