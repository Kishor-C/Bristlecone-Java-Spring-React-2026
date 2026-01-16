package com.bristlecone;
abstract class Car { 
	abstract double getPrice();
	abstract void mileage();
	void wheels() {
		System.out.println("4 wheels");
	}
}
class Creta extends Car {
	@Override
	void mileage() {
		System.out.println("mileage of creta is 15kmpl");
	}
	@Override
	double getPrice() {
		return 1500000;
	}	
}
class I20 extends Car {
	@Override
	void mileage() {
		System.out.println("mileage of I20 is 18kmpl");
	}
	@Override
	double getPrice() {
		return 1200000;
	}
}
public class TestAbstractClass {
	public static void main(String[] args) {
		Creta c = new Creta();
		I20 i = new I20();
		printCarInfo(c);
		printCarInfo(i);
	}
	public static void printCarInfo(Car c) {
		c.mileage();
		System.out.println("Price = "+c.getPrice());
		c.wheels();
		System.out.println("-------------");
	}
}	
