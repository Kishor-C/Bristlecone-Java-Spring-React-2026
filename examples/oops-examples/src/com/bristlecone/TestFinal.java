package com.bristlecone;

public class TestFinal {
	final int id;
	public TestFinal(int id) {
		this.id = id;
	}
	static final double PI = 3.14;
	public static void main(String[] args) {
		final int size = 20;
		System.out.println("size = "+size);
		TestFinal t1 = new TestFinal(25);
		TestFinal t2 = new TestFinal(35);
		System.out.println(t1.id+" "+t2.id);
		
	}
}

/*
 * 2 objects of TestFinal class -> 2 copies of id = 30, 1 copy of PI = 3.14
 * 
 */
