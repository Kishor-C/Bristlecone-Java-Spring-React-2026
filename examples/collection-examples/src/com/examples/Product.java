package com.examples;

public class Product implements Comparable<Product> {
	private int id;
	private String name;
	private double price;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public int compareTo(Product o) {
		//return id - o.getId(); 
		//return name.compareTo(o.getName()); // compares 2 string values
		//return Double.compare(price, o.getPrice()); // compares 2 double values
		return Integer.compare(id, o.getId());
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
