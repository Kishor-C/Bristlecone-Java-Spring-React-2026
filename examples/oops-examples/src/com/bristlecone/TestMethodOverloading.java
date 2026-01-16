package com.bristlecone;

class PrintData {
	/*
	 * void print(int x) { System.out.println("print(int)"); }
	 */
	/*
	 * void print(long x) { System.out.println("print(long)"); }
	 */
	/*
	 * void print(byte x) { System.out.println("print(byte)"); }
	 */
	
	  void print(short x) { System.out.println("print(short)"); }
	 

	/*
	 * void print(Integer x) { System.out.println("print(Integer)"); }
	 */
	// varying arguments 0 or more
	/*
	 * void print(int... x) { System.out.println("print(int...)"); }
	 */
}

public class TestMethodOverloading {
	public static void main(String[] args) {
		PrintData p = new PrintData();
		p.print((byte)25); // 25 is treated as in
		// byte -> short -> int -> long -> float -> double 
	}
}
